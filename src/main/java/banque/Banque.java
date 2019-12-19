package banque;

import javax.persistence.*;
import java.util.List;


	@Entity
	@Table(name="BANQUE")
	public class Banque {
		public Banque() {
			
		}
		
		@Id
		@Column(name="ID")
		private int id;						

		@Column(name="NOM")
		private String nom;					

		@OneToMany(mappedBy="banque")
		private List<ClientBanque> listeClients;

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

		public List<ClientBanque> getListeClients() {
			return listeClients;
		}

		public void setListeClients(List<ClientBanque> listeClients) {
			this.listeClients = listeClients;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "BANQUE [id=" + id + ", nom=" + nom + ", listeClients=" + listeClients + "]";
		}

	
}
