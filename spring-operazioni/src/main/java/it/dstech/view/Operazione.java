package it.dstech.view;

public class Operazione {
	private double primoNumero;
	private double secondoNumero;
	private String operazione;

	public Operazione(double primoNumero, double secondoNumero, String operazione) {
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
		this.operazione = operazione;
	}

	public double risultato() {
		if(operazione.equals("+")) {
			return addizione();
		}else if(operazione.equals("-")){
			return sottrazione();
		}else if(operazione.equals("*")){
			return moltiplicazione();
		}else if(!checkDivisione(secondoNumero)) {
			return 0.0;
		}return divisione();
	}
	public double addizione() {
		return primoNumero + secondoNumero;
	}

	public double sottrazione() {
		return primoNumero - secondoNumero;
	}

	public double moltiplicazione() {
		return primoNumero * secondoNumero;
	}

	public double divisione() {
		if (!checkDivisione(secondoNumero)) {
			return 0.0;
		}
		return primoNumero / secondoNumero;
	}
	public boolean checkDivisione(double divisore) {
		if (divisore == 0) {
			return false;
		}
		return true;
	}

}
