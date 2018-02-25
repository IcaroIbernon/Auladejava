package pratica1;

import java.util.Scanner;

public class Oitava {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String nome;
		int dias;
		int conta;
		int lucro=0;
		int s=0;
		while(s==0) {
			System.out.println("Nome do cliente:");
			nome=input.nextLine();
			System.out.println("Total de dias:");
			dias=input.nextInt();
			if(dias<10) {
				conta=dias*55;
			}else {
				conta=dias*48;
			}
			System.out.println("Cliente:"+nome+"\nConta:R$"+conta);
			lucro=lucro+conta;
			System.out.println("0-Inserir novo cliente\n1-Fechar total");
			s=input.nextInt();
			input.nextLine();
		}
		System.out.println("Total arrecadado:R$"+lucro);
		input.close();
}
}
