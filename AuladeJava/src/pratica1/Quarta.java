package pratica1;

import java.util.Scanner;

public class Quarta {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float sal;
		String nome;
		do{
			System.out.println("Digite o nome:");
			nome=input.nextLine();
			System.out.println("Digite o salario:");
			sal=input.nextFloat();
			input.nextLine();
			if(sal<500) {
				sal=(float) (sal+(sal*0.2));
				System.out.println(nome+" teve o salario ajustado para:R$"+sal);
			}else {
				System.out.println(nome+" não tem direito aumento.");
			}
		}while(nome.equalsIgnoreCase("fim")==false);
		input.close();
		}
}
