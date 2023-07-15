package lista1;

/*programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		//variaveis
		float PI, raio, resultado;
		
		//declarando o valor de PI
		PI = 3.14159f;
		
		//vonvertendo valores com ponto flutuante de "," para "."
		Locale.setDefault(Locale.US);
		
		//lendo o valor do raio
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o tamanho do raio");	
			raio = sc.nextFloat();
		
		sc.close();
		
		//processamento
		resultado = (float) (PI * Math.pow(raio, 2));
		
		//saida de dados
		System.out.printf("A = %.4f", resultado);
		
	}

}
