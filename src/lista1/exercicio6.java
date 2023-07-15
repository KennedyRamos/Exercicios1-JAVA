package lista1;

/* programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o valor de A:");
			double a = sc.nextDouble();
			System.out.println("Digite o valor de B:");
			double b = sc.nextDouble();
			System.out.println("Digite o valor de C:");
			double c = sc.nextDouble();
			System.out.println("\n"+"Áreas:"+"\n");
			
			// a área do triângulo retângulo que tem A por base e C por altura.
			double triangulo = (a*c)/2;
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			
			// a área do círculo de raio C. (pi = 3.14159)
			double pi = 3.14159;
			double circulo = pi* Math.pow(c, 2);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			
			// a área do trapézio que tem A e B por bases e C por altura
			double trapezio = ((a+b)*c)/2;
			System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
			
			// a área do quadrado que tem lado B
			double quadrado = Math.pow(b, 2);
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			
			// a área do retângulo que tem lados A e B
			double retangulo = a * b;
			System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
