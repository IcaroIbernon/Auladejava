package pratica1;

import java.util.Scanner;

public class Segunda {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x;
		for(int i=0;i<10;i++){
			System.out.println("Digite o numero:");
			x=input.nextInt();
			if(x%2==0){
				System.out.println("Par");
			}else{
				System.out.println("Impar");
		}
		}
		input.close();
	}
}
