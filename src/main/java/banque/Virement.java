package banque;

import javax.persistence.*;

	@Entity
	@Table(name="VIREMENT")
	public class Virement extends Operation{
		public Virement() {
		}
		
		@Column(name="BENEFICIAIRE")
		private String beneficiaire;
		
		public String getBeneficiaire() {
			return beneficiaire;
		}
		
		public void setBeneficiaire(String beneficiaire) {
			this.beneficiaire = beneficiaire;
		}
		
		@Override
		public String toString() {
			return "VIREMENT [BENEFICIAIRE=" + beneficiaire + "]";
		}
		
		
		
	}

