package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		RegleFizz regleFizz = new RegleFizz();
		
		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee();

		return String.valueOf(nombre);
	}



}