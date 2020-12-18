package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bloc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_bloc ;
	
	@Column(nullable=false)
	private String lib_bloc ;
	



	private int ordre = 0;
	
	@Column(length=1)
	private String actif = "O" ; // actif O/N
	
	
	public String getActif() {
		return actif;
	}



	public void setActif(String actif) {
		this.actif = actif;
	}



	public Set<Colonne> getColonnes() {
		return colonnes;
	}



	public void setColonnes(Set<Colonne> colonnes) {
		this.colonnes = colonnes;
	}





	@ManyToOne
	@JoinColumn(name="id_tab")
    private Tableau tableau ;
    
    
    @OneToMany(mappedBy="bloc")
    private Set<Ligne> lignes ;
    
    
    @OneToMany(mappedBy="bloc")
    private Set<Colonne> colonnes ;

	
	
    public Tableau getTableau() {
		return tableau;
	}



	public void setTableau(Tableau tableau) {
		this.tableau = tableau;
	}



	public Set<Ligne> getLignes() {
		return lignes;
	}



	public void setLignes(Set<Ligne> lignes) {
		this.lignes = lignes;
	}



	public long getId_bloc() {
		return id_bloc;
	}



	public String getLib_bloc() {
		return lib_bloc;
	}



	public void setLib_bloc(String lib_bloc) {
		this.lib_bloc = lib_bloc;
	}



	public int getOrdre() {
		return ordre;
	}



	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}





	public Bloc(String lib_bloc, Tableau tableau) {
		super();
		this.lib_bloc = lib_bloc;
		this.tableau = tableau;
	}
    
    

}
