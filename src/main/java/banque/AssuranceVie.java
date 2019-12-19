package banque;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ASSURANCE_VIE")
public class AssuranceVie extends Compte{
	public AssuranceVie() {
	}

	@Column(name="DATE_FIN")
	@Temporal(TemporalType.DATE)
	private LocalDate dateFin;

	@Column(name="TAUX")
	private double taux;

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "ASSURANCE_VIE [dateFin=" + dateFin + ", taux=" + taux + "]";
	}

	
}
