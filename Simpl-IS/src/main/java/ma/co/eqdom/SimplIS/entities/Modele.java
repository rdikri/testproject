package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modele {

	@Id
	private String id_modele;
	
	@Column(nullable=false,unique=true)
	private String lib_modele;
	
	private String fichier_xsd ;

	@OneToMany(mappedBy="modele")
	private Set<Tableau> tableaux;
	
	@Column(length=1)
	private String actif = "O" ; // actif O/N
	
	
	@OneToMany(mappedBy = "modele")
    private Set<ModeleSociete> modelesociete;
	
	
	public String getFichier_xsd() {
		return fichier_xsd;
	}

	public void setFichier_xsd(String fichier_xsd) {
		this.fichier_xsd = fichier_xsd;
	}

	public Modele(String id_modele, String lib_modele) {
		super();
		this.id_modele = id_modele;
		this.lib_modele = lib_modele;
	}

	public String getId_modele() {
		return id_modele;
	}

	public void setId_modele(String id_modele) {
		this.id_modele = id_modele;
	}

	public String getLib_modele() {
		return lib_modele;
	}

	public void setLib_modele(String lib_modele) {
		this.lib_modele = lib_modele;
	}

	
	
	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Modele [id_modele=" + id_modele + ", lib_modele=" + lib_modele + "]";
	}
}
