package model;



public class modelCalculator {
	
	private double n1;
	private double n2;
	private double resultado;
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public modelCalculator(double n1, double n2, double resultado) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.resultado = resultado;
	}
	
	public modelCalculator() {
		
	}
	
	public double sumar(double n1, double n2) {
		
		resultado = n1 + n2;
		
		return resultado;
	}
	
	public double restar(double n1, double n2) {
		
		resultado = n1 - n2;
		
		return resultado;
	}
	
	public double multiplicar(double n1, double n2) {
		
		resultado = n1 * n2;
		
		return resultado;
	}
	
	public double dividir (double n1, double n2) {
		
		if (n2 == 0) {
			resultado = 99999;
			return resultado;
		}else if (n1 == 0) {
			resultado = 0;
			return resultado;
		}else {
			resultado = n1 / n2;
			return resultado;
		}
		
	}
	
	public double expo(double n1 , double n2) {
		
		if (n2 == 0) {
			return 1;
		} else if (n2 == 1) {
			return n1;
		}else{
			for (int i = 1; i <= n2; i++) {
				resultado *= n1;
			}
			return resultado;
		}
		
	}
	
}
