package ma.co.eqdom.SimplIS.entities;

import java.io.Serializable;

public class TableauSocieteKey implements Serializable {
	
	
	private String id_modele ;
	
	private String id_tableau ;
	
	private long id_societe ;

	public String getId_modele() {
		return id_modele;
	}

	public void setId_modele(String id_modele) {
		this.id_modele = id_modele;
	}

	public String getId_tableau() {
		return id_tableau;
	}

	public void setId_tableau(String id_tableau) {
		this.id_tableau = id_tableau;
	}

	public long getId_societe() {
		return id_societe;
	}

	public void setId_societe(long id_societe) {
		this.id_societe = id_societe;
	}

	public TableauSocieteKey(String id_modele, String id_tableau, long id_societe) {
		super();
		this.id_modele = id_modele;
		this.id_tableau = id_tableau;
		this.id_societe = id_societe;
	}
	
	

}


