package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		
		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee();

		if (isBuzz(nombre))
			return "buzz";

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}