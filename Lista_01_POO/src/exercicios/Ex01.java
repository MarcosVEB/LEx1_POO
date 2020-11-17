package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		double altura = s.nextDouble();
		System.out.println("Informe o peso: ");
		double peso = s.nextDouble();
		System.out.println("Informe o sexo, m para masculino ou f para feminino: ");
		char sexo = s.next().charAt(0);
		
		double ideal;
		if(sexo == 'm') {
			ideal = (altura * 72.7) - 58;
			System.out.println("Altura: " + altura + ", peso: " + peso + " kg, sexo: " + sexo);
			System.out.println("Peso ideal: " + ideal + " kg");
			if(peso < ideal) {
				System.out.println("Abaixo do peso ideal.");
			} else if(peso > ideal) {
				System.out.println("Acima do peso ideal.");
			}else {
				System.out.println("No peso ideal.");
			}
		} else if(sexo == 'f') {
			ideal = (altura * 62.1) - 44.7;
			System.out.println("Altura: " + altura + ", peso: " + peso + " kg, sexo: " + sexo);
			System.out.println("Peso ideal: " + ideal + " kg");
			if(peso < ideal) {
				System.out.println("Abaixo do peso ideal.");
			} else if(peso > ideal) {
				System.out.println("Acima do peso ideal.");
			}else {
				System.out.println("No peso ideal.");
			}
		}else {
			System.out.println("O sexo informado não é válido, digite f para feminino ou m para masculino.");
		}
		s.close();
	}

}
