package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@IdClass(TableauId.class)
public class Tableau {
	
   
	
	@Id
    @ManyToOne
    @JoinColumn(name="id_modele")
    private Modele modele ;
	
	@Id
	private String id_tableau ;

    @Column(nullable=false)
    private String lib_tableau ;

    @OneToMany(mappedBy="tableau")
	private Set<Bloc> blocs;
    
    
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

	public Tableau(Modele modele, String id_tableau, String lib_tableau , int ordre) {
		super();
		this.modele = modele;
		this.id_tableau = id_tableau;
		this.lib_tableau = lib_tableau;
		this.ordre = ordre ;
	}
	
	
	
}

