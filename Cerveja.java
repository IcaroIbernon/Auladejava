package Exercicio;
import java.util.Scanner;
public class Cerveja {
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			int x=99;
			while(x!=0) {
				System.out.println(x + " Garrafas de cerveja na geladeira");
				x=x-1;
				System.out.println("Tomo uma e ficam: " + x);
			if(x==0) {
				System.out.println("Deseja reabastecer?[S/N]");
				String s =leitor.nextLine();
				if("s".equalsIgnoreCase(s)) { 
					x=99;
				}
			}
			System.out.println("Acabou a cerveja!");
		}
			leitor.close();
	}
	}
