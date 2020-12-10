package ma.co.eqdom.SimplIS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Cellule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_cellule ;
	
		
	private String codeedi ;
	
	@Enumerated(EnumType.STRING)
	private Data_typeEnum data_type ;
	
		
	@Column(length=1)
	private String extrafield ; // O/N
	
	
	
	@ManyToOne 
	@JoinColumn(name="id_ligne")
	private Ligne ligne ;
	
	@ManyToOne 
	@JoinColumn(name="id_colonne")
	private Colonne colonne ;
	
	@Column(length=1)
	private String actif = "O" ; // actif O/N
	

	public Ligne getLigne() {
		return ligne;
	}

	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}

	public Colonne getColonne() {
		return colonne;
	}

	public void setColonne(Colonne colonne) {
		this.colonne = colonne;
	}

	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	public String getCodeedi() {
		return codeedi;
	}

	public void setCodeedi(String codeedi) {
		this.codeedi = codeedi;
	}

	public Data_typeEnum getData_type() {
		return data_type;
	}

	public void setData_type(Data_typeEnum data_type) {
		this.data_type = data_type;
	}


	public String getExtrafield() {
		return extrafield;
	}

	public void setExtrafield(String extrafield) {
		this.extrafield = extrafield;
	}


	public long getId_cellule() {
		return id_cellule;
	}

	
}
