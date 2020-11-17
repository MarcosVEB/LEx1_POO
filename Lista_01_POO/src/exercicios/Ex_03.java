package exercicios;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseja sacar. O valor mínimo é de R$10,00 e o máximo de R$600,00:  ");
		int valor = (int) s.nextDouble();
		
		if(valor < 10 || valor > 600) {
			System.out.println("Valor inválido, informe um valor entre R$10,00 e 600,00");
		}else {
			
		int cont100 = (int) valor / 100;
		valor = valor - (100 * cont100);
		int cont50 = (int) valor / 50;
		valor = valor - (50 * cont50);
		int cont10 = (int) valor / 10;
		valor = valor - (10 * cont10);
		int cont5 = (int) valor / 5;
		valor = valor - (5 * cont5);
		int cont1 = valor;
		
			System.out.println("Notas de R$100: "+ cont100);
			System.out.println("Notas de R$50: " + cont50);
			System.out.println("Notas de R$10: " + cont10);
			System.out.println("Notas de R$5: " + cont5);
			System.out.println("Notas de R$1: " + cont1);
			s.close();
		}
	}
}