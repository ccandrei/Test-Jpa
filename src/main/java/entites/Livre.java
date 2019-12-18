package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import java.util.List;

@Entity
@Table(name = "LIVRE")
public class Livre {

	@Id
	private int id;

	@Column(name = "TITRE")
	private String titre;

	@Column(name = "AUTEUR")
	private String auteur;

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
	private List<Emprunt> listeEmprunts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public List<Emprunt> getListeEmprunts() {
		return listeEmprunts;
	}
	
	public void setListeEmprunts(List<Emprunt> listeEmprunts) {
		this.listeEmprunts = listeEmprunts;
	}
	
}
