package test;

import java.util.Scanner;

public class uri1113Combustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int gasolina = 0, alcool = 0, disiel = 0;

		while (x != 4) {
			if (x == 1) {
				gasolina++;

			} else if (x == 2) {
				alcool++;
			} else {
				disiel++;
			}
			x = sc.nextInt();
		}
		System.out.println("Muito obrigado");
		System.out.println(gasolina);
		System.out.println(alcool);
		System.out.println(disiel);

		sc.close();
	}

}
