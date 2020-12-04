package ma.co.eqdom.SimplIS.entities;

import java.io.Serializable;




public class TableauId implements Serializable  {

	private Modele modele;
	private String id_tableau;

	

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



}
