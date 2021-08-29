package test;

import java.util.Scanner;

public class horas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		double price = 200;
		
		double descont = 0;
		
		if(price <= 200.0) {
			descont =  price * 0.1;
		}
		
		System.out.println(descont);
		
		sc.close();

}
}
