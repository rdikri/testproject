package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Colonne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_colonne ;
	
	@Column(nullable=false)
	private String lib_colonne ;
	
	
	private int ordre = 0 ;
	
	@Column(length=1)
	private String actif = "O" ; // actif O/N
	
	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	public Set<Cellule> getCellules() {
		return cellules;
	}

	public void setCellules(Set<Cellule> cellules) {
		this.cellules = cellules;
	}

	@ManyToOne
	@JoinColumn(name="id_bloc")
	private Bloc bloc ;
	

	@OneToMany(mappedBy="colonne")
	private Set<Cellule>  cellules ;

	public String getLib_colonne() {
		return lib_colonne;
	}

	public void setLib_colonne(String lib_colonne) {
		this.lib_colonne = lib_colonne;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Bloc getBloc() {
		return bloc;
	}

	public void setBloc(Bloc bloc) {
		this.bloc = bloc;
	}

	public long getId_colonne() {
		return id_colonne;
	}

	public Colonne(String lib_colonne, int ordre, Bloc bloc) {
		super();
		this.lib_colonne = lib_colonne;
		this.ordre = ordre;
		this.bloc = bloc;
	}
	
	
	

}
