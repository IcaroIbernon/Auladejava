package exeArray;

import java.util.Arrays;
import java.util.Scanner;
/**
* Esta classe representa quinta questão da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class Quinta {
	/**
	* Método responsável por criar um array de 10 posições contendo
	* inteiros e por em ordem crescente.
	* @param lista array de 10 posições
	* @return array em ordem crescente.
	*/
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] lista;
		lista = new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Digite "+(i+1)+":");
			lista[i]=input.nextInt();
		}
		Arrays.sort(lista);
		System.out.println(Arrays.toString(lista));
		input.close();
	}
	
}
