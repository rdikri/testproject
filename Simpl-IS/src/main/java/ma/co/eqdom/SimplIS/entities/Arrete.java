package ma.co.eqdom.SimplIS.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Arrete {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_arrete ;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dat_debut ;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dat_fin ;
	


	public Date getDat_debut() {
		return dat_debut;
	}

	public void setDat_debut(Date dat_debut) {
		this.dat_debut = dat_debut;
	}

	public Date getDat_fin() {
		return dat_fin;
	}

	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}

	public long getId_arrete() {
		return id_arrete;
	}

	public Arrete(Date dat_debut, Date dat_fin) {
		super();
		this.dat_debut = dat_debut;
		this.dat_fin = dat_fin;
	}
	
	
}
