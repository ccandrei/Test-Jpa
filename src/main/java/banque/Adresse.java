package banque;

import javax.persistence.*;

@Embeddable
public class Adresse {
	public Adresse() {
	}
	
	public Adresse(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Column(name="NUMERO")
	private int numero;     

	@Column(name="RUE")
	private String rue;		

	@Column(name="CODE_POSTAL")
	private int codePostal;	

	@Column(name="VILLE")
	private String ville;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adresse [numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}  
}
	
	


