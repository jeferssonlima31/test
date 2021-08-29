package test;

import java.util.Scanner;

public class para1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {

			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in++;

			} else {
				out++;
			}

		}
		System.out.println("IN " + in);
		System.out.println("Out " + out);
		sc.close();

	}

}
