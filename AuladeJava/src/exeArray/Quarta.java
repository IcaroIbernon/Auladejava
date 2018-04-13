package exeArray;
import java.util.Arrays;
import java.util.Scanner;
/**
* Esta classe representa quarta questão da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class Quarta {
	/**
	* Método responsável por criar um array de 10 posições contendo
	* strings e por em ordem alfabetica.
	* @param lista array de 10 posições
	* @return array em ordem alfabética.
	*/
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String[] lista= new String[10];
		for(int i=0;i<10;i++) {
			lista[i]=input.nextLine();
		}
		Arrays.sort(lista);
		for(int j=0;j<10;j++) {
			System.out.println(lista[j]);
		}
		input.close();
}
}
