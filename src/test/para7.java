package test;

import java.util.Scanner;

public class para7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {

			int primeiro = i, segundo = i * i, terceiro = i * i * i;

			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			
			sc.close();
		}
	}

}
