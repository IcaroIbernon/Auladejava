package pratica1;

import java.util.Scanner;

public class Primeira {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float inicial;
		float aumento;
		float aumentado;
		float sfinal;
		System.out.println("Salario Inicial:");
		inicial=input.nextFloat();
		System.out.println("Percentual de aumento:");
		aumento=input.nextFloat();
		sfinal=inicial + (inicial*(aumento/100));
		aumentado=(inicial*(aumento/100));
		System.out.println("Salario final:"+ sfinal);
		System.out.println("Aumento:"+ aumentado);
		input.close();
	}
}
