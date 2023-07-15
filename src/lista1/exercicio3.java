package lista1;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)*/
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//entrada de dados
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o valor de A:");
			int A = sc.nextInt();
			System.out.println("\nDigite o valor de B:");
			int B = sc.nextInt();
			System.out.println("\nDigite o valor de C:");
			int C = sc.nextInt();
			System.out.println("\nDigite o valor de D:");
			int D = sc.nextInt();
		
		sc.close();
		
		//processamento
		int diferenca = ((A*B)-(C*D));
		
		//saida de dados
		System.out.println("\n"+"Diferença: " + diferenca);
	}

}
