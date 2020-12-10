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
public class Ligne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_ligne ;
	
	@Column(nullable=false)
	private String lib_ligne ;
	
	private int ordre = 0;
	
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

	@OneToMany(mappedBy="ligne")
	private Set<Cellule>  cellules ;
	
	public long getId_ligne() {
		return id_ligne;
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

	

	public String getLib_ligne() {
		return lib_ligne;
	}

	public void setLib_ligne(String lib_ligne) {
		this.lib_ligne = lib_ligne;
	}

	public Ligne(String lib_ligne, int ordre, Bloc bloc) {
		super();
		this.lib_ligne = lib_ligne;
		this.ordre = ordre;
		this.bloc = bloc;
	}
	
	

}
