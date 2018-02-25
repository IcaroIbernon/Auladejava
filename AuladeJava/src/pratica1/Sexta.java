package pratica1;

import java.util.Scanner;

public class Sexta {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float sal;
		float prest;
		float prestm;
		System.out.println("Insira Salario Bruto:");
		sal=input.nextFloat();
		prestm=(float) (sal*0.3);
		System.out.println("Informe o valor da prestacão:");
		prest=input.nextFloat();
		if(prest<=prestm) {
			System.out.println("Concedido");
		}else {
			System.out.println("Não concedido");
		}
		input.close();
	}
}
