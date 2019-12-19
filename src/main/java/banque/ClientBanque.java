package banque;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="CLIENT_BANQUE")
public class ClientBanque {
	
	public ClientBanque () {
		
	}
	
	@Id
	@Column(name="ID")
	private int id; 						

	@Column(name="NOM")
	private String nom; 					

	@Column(name="PRENOM")
	private String prenom; 					

	@Column(name="DATE_NAISSANCE")
	//@Temporal(TemporalType.DATE)
	private LocalDate dateNaissance;		

	@Embedded
	private Adresse adresse;			

	@ManyToMany
	@JoinTable(name="client_compte", joinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID"), inverseJoinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID"))
	private List<Compte> listeComptes;

	@ManyToOne
	@JoinColumn(name="ID_BANQUE")
	private Banque banque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLIENT_BANQUE [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", listeComptes=" + listeComptes + ", banque=" + banque + "]";
	}

}
