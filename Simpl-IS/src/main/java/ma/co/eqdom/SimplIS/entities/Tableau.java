package ma.co.eqdom.SimplIS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@IdClass(TableauId.class)
public class Tableau {
	
   
	
	@Id
    @ManyToOne
    @JoinColumn(name="id_modele")
    private Modele modele ;
	
	@Id
	private String id_tableau ;

    @Column(nullable=false)
    private String lib_tableau ;

    
    
    
	public String getLib_tableau() {
		return lib_tableau;
	}

	public void setLib_tableau(String lib_tableau) {
		this.lib_tableau = lib_tableau;
	}
}

