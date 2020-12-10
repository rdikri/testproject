package ma.co.eqdom.SimplIS.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Societe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_societe ;
	
	@Column(nullable=false)
	private String denomination ;
	
	private String forme_juridique ;
	
	private String regime ;
	
	private String activite ;
	
	@Column(nullable=false)
	private String id_fiscal ;
	
	private String reg_commerce ;
	
	private String num_taxe_prof ;
	
	private String num_cnss ;
	
	private String adresse ;
	
	private String code_postal ;
	
	private String ville ;
	
	private String telephone ;
	
	private String fax ;
	
	private String email ;
	
	private String banque ;
	
	private String agence ;
	
	private String rib ;
	
	@Column(length=1)
	private String actif = "O" ; // actif O/N

	@OneToMany(mappedBy = "societe")
    private Set<ModeleSociete> modelesociete;
	
	
	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getForme_juridique() {
		return forme_juridique;
	}

	public void setForme_juridique(String forme_juridique) {
		this.forme_juridique = forme_juridique;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getId_fiscal() {
		return id_fiscal;
	}

	public void setId_fiscal(String id_fiscal) {
		this.id_fiscal = id_fiscal;
	}

	public String getReg_commerce() {
		return reg_commerce;
	}

	public void setReg_commerce(String reg_commerce) {
		this.reg_commerce = reg_commerce;
	}

	public String getNum_taxe_prof() {
		return num_taxe_prof;
	}

	public void setNum_taxe_prof(String num_taxe_prof) {
		this.num_taxe_prof = num_taxe_prof;
	}

	public String getNum_cnss() {
		return num_cnss;
	}

	public void setNum_cnss(String num_cnss) {
		this.num_cnss = num_cnss;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public long getId_societe() {
		return id_societe;
	}
	
    	

}
