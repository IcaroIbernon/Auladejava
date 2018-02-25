package pratica1;

import java.util.Scanner;

public class Terceira {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Deseja saber tabuada de que numero?");
		x=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(i+"x"+x+"="+(x*i));
		}
		input.close();
	}
}
