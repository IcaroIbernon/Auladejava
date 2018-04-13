package exeArray;

import java.util.Arrays;
import java.util.Scanner;
/**
* Esta classe representa primeira e a segunda questão da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class PrimeiraSegunda {
	/**
	* Método responsável por criar um array de 300 posições contendo valor 45
	* @param lista array de 300 posições
	* @return array preenchido com valor 45 em todas as posições de 3 
	* formas diferentes.
	*/
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] lista;
		int k=0;
		System.out.println("Primeiro metodo:");
		lista = new int[300];
		for(int i=0;i<300;i++) {
			lista[i]=45;
			System.out.print((i+1)+"="+lista[i]+"  ");
		}
		System.out.println("Segundo metodo:");
		while(k<300) {
			System.out.println(lista[k]);
			k++;
		}
		System.out.println();
		System.out.println("Terceiro metodo:");
		System.out.println(Arrays.toString(lista));
		input.close();
	}
}
