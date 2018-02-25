package pratica1;

import java.util.Scanner;

public class Quinta {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float l;
		float p;
		System.out.println("Quantos litros:");
		l=input.nextFloat();
		p=(float) ((2.5*l)+6);
		System.out.println("Total a ser pago:R$"+p);
		input.close();
	}
}
