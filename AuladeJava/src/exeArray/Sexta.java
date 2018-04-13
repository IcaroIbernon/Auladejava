package exeArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
* Esta classe representa terceira questão da lista de array
* @author Icaro Ibernon
* @author icaroibernon@live.com
* @version 1.0
*/
public class Sexta {
	/**
	* Método responsável por receber um objeto de usario e chave(não repetida)
	* @param chave não repetida
	* @param nome ligada a chave
	* @param con constante para continuar adicionando nomes
	* @return usuario e chave.
	*/
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		Scanner input= new Scanner(System.in);
		int chave;
		int con=0;
		String nome;
		String teste;
		while(con==0){
		System.out.println("Digite 0 para inserir pessoa e chave:");
		con=input.nextInt();
		if(con==0){
		input.nextLine();
		System.out.println("Digite o nome:");
		nome=input.nextLine();
		System.out.println("Digite a chave(não deve já ser utilizada):");
		chave=input.nextInt();
		teste=map.get(chave);
		if(teste==null){
		input.nextLine();
		map.put(chave, nome);
		}
		else{
		System.out.println("Chave utiliza, recomece.");
		}
		}
		}
		input.close();
		System.out.println(Arrays.asList(map));
		}
		}
