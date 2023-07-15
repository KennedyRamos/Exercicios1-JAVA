package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o codigo da peça 1:");
			int codigo1 = sc.nextInt();
			System.out.println("Digite a quantidade de peça 1:");
			int pecas1 = sc.nextInt();
			System.out.println("Qual o valor unitario da peça 1:");
			double valor1 = sc.nextDouble();
			
			System.out.println("---------------------------------");
			
			System.out.println("Digite o codigo da peça 2:");
			int codigo2 = sc.nextInt();
			System.out.println("Digite a quantidade de peça 2:");
			int pecas2 = sc.nextInt();
			System.out.println("Qual o valor unitario da peça 2:");
			double valor2 = sc.nextDouble();
	
			System.out.println("---------------------------------");
		sc.close();
		
		//processamento
		double valorTotal = (pecas1 * valor1)+(pecas2 * valor2);
		
		//saida de dados
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
	}

}
