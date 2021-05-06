package calculadora;

public class calculadora {
	float num1;
	float num2;
	
	public calculadora(float num1,float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public float sumar() {
		return this.num1+this.num2;
	}
	
	public float restar() {
		return this.num1-this.num2;
	}
	public float multiplicar() {
		return this.num1*this.num2;
	}
	public float dividir() {
		return this.num1/this.num2;
	}
	
	public float valorAbsoluto() {
		return Math.abs(this.num1);
	}
	public float elevar() {
		return (float) Math.pow(this.num1, this.num2);
	}
	
	public boolean esPositivo() {
		if(this.num1%2 == 0) {
			return true;
		}else {
			return false;
		}
	}





}
