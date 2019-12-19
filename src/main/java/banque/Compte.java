package banque;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	public Compte() {
	}
	@Id
	@Column(name="ID")
	private int id; 						

	@Column(name="NUMERO")
	private String numero;					

	@Column(name="SOLDE")
	private double solde;					

	@ManyToMany
	@JoinTable(name="client_compte", joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID"), inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID"))
	private List<ClientBanque> proprietaires;		

	@OneToMany(mappedBy="compte")
	private List<Operation> listeOperations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<ClientBanque> getProprietaires() {
		return proprietaires;
	}

	public void setProprietaires(List<ClientBanque> proprietaires) {
		this.proprietaires = proprietaires;
	}

	public List<Operation> getListeOperations() {
		return listeOperations;
	}

	public void setListeOperations(List<Operation> listeOperations) {
		this.listeOperations = listeOperations;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "COMPTE [id=" + id + ", numero=" + numero + ", solde=" + solde + ", listeOperations=" + listeOperations+ "]";
	}
	
	
	
	
}
