package lista1;

/*programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa*/

//importação da biblioteca Scanner para fazer a leitura dos números

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			//exibindo mensagem e recebendo o primeiro valor
			System.out.println("Digite o primeiro número:");
			int x = sc.nextInt();
			
			//exibindo mensagem e recebendo o segundo valor
			System.out.println("Digite o primeiro número:");
			int y = sc.nextInt();
		
		sc.close();
		
		//variavel que vai receber a soma dos dois valores
		int soma = x + y;
		
		//exibindo na tela os dois valores digitados e a soma entre eles
		System.out.print("\n"+"a soma de "+ x +" mais "+ y +" é igual a: "+ soma);
		
	}

}
