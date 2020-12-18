package ma.co.eqdom.SimplIS.entities;

import java.io.Serializable;




public class TableauSocieteKey implements Serializable {
	
	
	private long id_tab ;
	
		
		
	private String id_societe ;




	public long getId_tab() {
		return id_tab;
	}


	public void setId_tab(long id_tab) {
		this.id_tab = id_tab;
	}


	public String getId_societe() {
		return id_societe;
	}


	public void setId_societe(String id_societe) {
		this.id_societe = id_societe;
	}



	

}


