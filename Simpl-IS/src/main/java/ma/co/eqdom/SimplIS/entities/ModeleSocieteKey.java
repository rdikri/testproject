package ma.co.eqdom.SimplIS.entities;

import java.io.Serializable;

public class ModeleSocieteKey implements Serializable {
	
	private String id_modele ;
	
	private long id_societe ;

	public String getId_modele() {
		return id_modele;
	}

	public void setId_modele(String id_modele) {
		this.id_modele = id_modele;
	}

	public long getId_societe() {
		return id_societe;
	}

	public void setId_societe(long id_societe) {
		this.id_societe = id_societe;
	}

}
