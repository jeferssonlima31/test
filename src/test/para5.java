package test;

import java.util.Locale;
import java.util.Scanner;

public class para5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();

		double soma = 0;
		double x, y, z;
		for (int i = 0; i < N; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			soma = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f%n",soma);

		}
		
		sc.close();
	}

}
