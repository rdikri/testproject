package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(indexes = { 
		 @Index(name="indx_tableau_modele" , columnList="id_tableau,id_modele" , unique=true) ,
		 @Index(name="indx_tableau_actif" , columnList="actif" )
		})
public class Tableau {
		

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_tab ;
	
	
    @ManyToOne
    @JoinColumn(name="id_modele")
    private Modele modele ;
	
	
    @Column(nullable=false)
	private String id_tableau ;

    @Column(nullable=false)
    private String lib_tableau ;

    @OneToMany(mappedBy="tableau")
	private Set<Bloc> blocs;
    
    @OneToMany(mappedBy="tableau")
	private Set<TableauSociete> tableauSociete;
    
    
    private int ordre = 0 ;
    
	@Column(length=1)
	private String actif = "O" ; // actif O/N
	
	
	
    
	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public String getLib_tableau() {
		return lib_tableau;
	}

	public void setLib_tableau(String lib_tableau) {
		this.lib_tableau = lib_tableau;
	}

	public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}

	public String getId_tableau() {
		return id_tableau;
	}

	public void setId_tableau(String id_tableau) {
		this.id_tableau = id_tableau;
	}

	public Set<Bloc> getBlocs() {
		return blocs;
	}

	public void setBlocs(Set<Bloc> blocs) {
		this.blocs = blocs;
	}

	public Set<TableauSociete> getTableauSociete() {
		return tableauSociete;
	}

	public void setTableauSociete(Set<TableauSociete> tableauSociete) {
		this.tableauSociete = tableauSociete;
	}

	public long getId_tab() {
		return id_tab;
	}

	
}

