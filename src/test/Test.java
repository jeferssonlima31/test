package test;

import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double metroq = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroq;

		System.out.printf("A área do terreno é: %.2f%n", area);
		System.out.printf("O valor do terreno é: %.3f%n", preco);

		sc.close();

	}

}
