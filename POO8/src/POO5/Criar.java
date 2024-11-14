package POO5;

public class Criar implements Conversor {
	
	
	private float preçoDolar;
	private float valorReal;
    private float dolarComprado;


   
    	
	public float conversorMoeda() {
		this.valorReal = preçoDolar*dolarComprado;
		
		System.out.println("Preço do dolar: " + String.format("%.2f", this.getPreçoDolar()));
		System.out.println("Quantos dolares voce comprou: " + String.format("%.2f", this.getDolarComprado()));
		System.out.println("valor pago em real: " + String.format("%.2f", this.getValorReal()));
		return 0;
	}
	public float getPreçoDolar() {
		return preçoDolar;
	}
	public void setPreçoDolar(float preçoDolar) {
		this.preçoDolar = preçoDolar;
	}
	public float getValorReal() {
		return valorReal;
	}
	public void setValorReal(float valorReal) {
		this.valorReal = valorReal;
	}
	public float getDolarComprado() {
		return dolarComprado;
	}
	public void setDolarComprado(float dolarComprado) {
		this.dolarComprado = dolarComprado;
	}
}
