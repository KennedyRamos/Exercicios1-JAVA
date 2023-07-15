package lista1;

/* programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais */

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			//Número do funcionrio
			System.out.println("Digite o número do funcionario:");
			int numFunci = sc.nextInt();
			
			//Quantas horas ele trabalhou
			System.out.println("Quantas horas foram trabalhadas?");
			int horas = sc.nextInt();
			
			//Valor da hora trabablhada
			System.out.println("Qual ovalor da hora trabalhada?");
			double valorHora = sc.nextDouble();
			
			//processando o valor do salario
			double salario = (double) valorHora * horas;
			
		sc.close();
		
		//saida de dados com o número do funcionario e o salário
		System.out.println("NUMBER = " + numFunci);
		System.out.println("SALARY = " + salario);
		
	}

}
