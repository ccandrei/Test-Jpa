package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="CLIENT")
public class Client {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name ="Nom" )
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private List<Emprunt> listeEmprunts;

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

	public List<Emprunt> getListeEmprunts() {
		return listeEmprunts;
	}

	public void setListeEmprunts(List<Emprunt> listeEmprunts) {
		this.listeEmprunts = listeEmprunts;
	}
	
	@Override
	public String toString() {
		return "CLIENT [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
