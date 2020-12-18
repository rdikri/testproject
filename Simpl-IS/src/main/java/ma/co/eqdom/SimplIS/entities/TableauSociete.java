package ma.co.eqdom.SimplIS.entities;



import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;




@Entity
public class TableauSociete {
	


    @EmbeddedId	
	private TableauSocieteKey tableauSocieteKey ;
	
	

	@ManyToOne
	@MapsId("id_tab")
    @JoinColumn(name = "id_tab")
	private Tableau tableau ;
	
	
	@ManyToOne
	@MapsId("id_societe")
    @JoinColumn(name = "id_societe")
	private Societe societe ;

	






	public Tableau getTableau() {
		return tableau;
	}


	public void setTableau(Tableau tableau) {
		this.tableau = tableau;
	}


	public Societe getSociete() {
		return societe;
	}


	public void setSociete(Societe societe) {
		this.societe = societe;
	}


		
	
	

}
