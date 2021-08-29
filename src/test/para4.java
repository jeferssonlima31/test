package test;

import java.util.Scanner;

public class para4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double N = sc.nextDouble();
		double a, b;
		double soma = 0;

		for (int i = 0; i < N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			if (b == 0) {
				System.out.println("divisão impossível");

			} else {
				soma = a / b;
			System.out.println(soma);

		}
		}
		sc.close();

	}

}
