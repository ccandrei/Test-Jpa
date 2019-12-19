package banque;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	public Operation() {
		
	}
	
	@Id
	@Column(name="ID")
	private int id;					

	@Column(name="DATE")
	@Temporal(TemporalType.DATE)
	private LocalDate date;			

	@Column(name="MONTANT")
	private double montant;			

	@Column(name="MOTIF")
	private String motif;			

	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "OPERATION [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}
	

	
}
