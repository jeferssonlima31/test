package test;

import java.util.Scanner;

public class fatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.0;

		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		System.out.println(conta);

		sc.close();
	}

}
