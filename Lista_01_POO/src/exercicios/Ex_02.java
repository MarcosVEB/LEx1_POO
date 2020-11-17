package exercicios;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		double salario = s.nextDouble();
		double reajuste = salario;
		double percentual;
		if(salario <= 280) {
			percentual = 0.2;
			reajuste += salario * percentual;
		} else if(salario <= 700) {
			percentual = 0.15;
			reajuste += salario * percentual;
		} else if(salario <= 1500) {
			percentual = 0.1;
			reajuste += salario * percentual;
		} else {
			percentual = 0.05;
			reajuste += salario * percentual;
		}
		
		System.out.println("Salário antes do reajuste: R$ " + salario);
		System.out.println("Percentual aplicado no reajuste: " + percentual);
		System.out.println("Valor do aumento: R$" + (reajuste - salario));
		System.out.println("Novo salário: " + reajuste);
		s.close();
		}
}
