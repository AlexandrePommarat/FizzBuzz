package rules;

public class RegleBuzz implements Regle {
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 5;
	}
	
	public String valeurAAfficherSiRegleVerifiee() {
		return "buzz";
	}
}
