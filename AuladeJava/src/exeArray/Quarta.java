package exeArray;
import java.util.Arrays;
import java.util.Scanner;
/**
* Esta classe representa quarta quest�o da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class Quarta {
	/**
	* M�todo respons�vel por criar um array de 10 posi��es contendo
	* strings e por em ordem alfabetica.
	* @param lista array de 10 posi��es
	* @return array em ordem alfab�tica.
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
