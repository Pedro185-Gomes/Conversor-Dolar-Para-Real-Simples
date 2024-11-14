package POO5;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	Criar c1= new Criar();
	
	System.out.println("Qual é o preço do dolar: ");
	c1.setPreçoDolar( scan.nextFloat());
	 System.out.println("quantos dolares voce quer comparar? ");
	 c1.setDolarComprado(scan.nextFloat());
	 c1.conversorMoeda();
	
	}

}
