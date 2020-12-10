package ma.co.eqdom.SimplIS.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

public class TableauSociete {
	
	@EmbeddedId
	private TableauSocieteKey id ;
	
	@ManyToOne
	@MapsId("id_modele")
	private Modele modele ;
	
	@ManyToOne
	@MapsId("id_tableau")
	private Tableau tableau ;
	
	
	@ManyToOne
	@MapsId("id_societe")
	private Societe societe ;
	
	

}
