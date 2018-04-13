package exeArray;

import java.util.Arrays;
import java.util.Scanner;
/**
* Esta classe representa terceira questão da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class Terceira {
	/**
	* Método responsável por criar um array de 10 posições receber
	* 10 inteiros e comparar com a e dizer os indices onde ele esta presente
	* apos a organização do array
	* @param lista array de 10 posições
	* @param a numero buscado no array
	* @param b indices que a aparece ou se não aparece no array
	* @return em que indices o o parametro a esta presente
	*/
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] lista;
		int a,b=0,c=0;
		lista = new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Digite "+(i+1)+":");
			lista[i]=input.nextInt();
		}
		Arrays.sort(lista);
		System.out.println("Digite o numero que deseja achar na lista:");
		a=input.nextInt();
		c=Arrays.binarySearch(lista, a);
		System.out.println("Por pesquisa binaria:");
		if(c>0) {
			System.out.println("Presente no indice:"+c);
		}else {
			System.out.println("Não esta presente na lista!");
		}
		System.out.println("Por pesquisa normal:");
		for(int j=0;j<10;j++) {
			if(a==lista[j]) {
				System.out.println("O numero esta presente no indice:"+(j+1));
				b++;
			}
		}
		if(b==0) {
			System.out.println("Não esta presente na lista!");
		}
		input.close();
}
}
