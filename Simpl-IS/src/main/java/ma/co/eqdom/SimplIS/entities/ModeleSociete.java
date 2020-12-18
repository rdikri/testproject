package ma.co.eqdom.SimplIS.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
public class ModeleSociete {

	@EmbeddedId	
	private ModeleSocieteKey id ;
	
	@ManyToOne
	@MapsId("id_modele")
    @JoinColumn(name = "id_modele")
    private Modele modele;

    @ManyToOne
    @MapsId("id_societe")
    @JoinColumn(name = "id_societe")
    private Societe societe;
    
    private String actif ;

	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	

	public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}
    
    
	
}
