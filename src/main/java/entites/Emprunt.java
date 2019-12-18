package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	@Id
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_FIN")
	private Date dateFin;

	@Column(name = "DELAI")
	private int delai;

	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> listeLivres;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Livre> getListeLivres() {
		return listeLivres;
	}

	public void setListeLivres(List<Livre> listeLivres) {
		this.listeLivres = listeLivres;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client + ", listeLivres=" + listeLivres + "]";
	}
	
	
}
