package pratica1;

import java.util.Scanner;

public class Setima {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float n1;
		float n2;
		float[] me=new float[6];
		float met=0;
		int ap=0,re=0,fn=0;
		for(int i=0;i<6;i++) {
			System.out.println("Primeira nota:");
			n1=input.nextFloat();
			System.out.println("Segunda nota:");
			n2=input.nextFloat();
			me[i]=(n1+n2)/2;
			if(me[i]<3) {
				re=re+1;
			}else if(me[i]<7){
				fn=fn+1;
			}else {
				ap=ap+1;
			}
		}
		input.close();
		for(int i=0;i<6;i++) {
			System.out.println("Aluno"+(i+1)+" media= "+me[i]);
			met=me[i]+met;
			if(me[i]<3) {
				System.out.println("Reprovado");
			}else if(me[i]<7){
				System.out.println("Final");
			}else {
				System.out.println("Aprovado");
			}
		}
		met=met/6;
		System.out.println("Media da classe="+met);
		System.out.println("Aprovados="+ap);
		System.out.println("Final="+fn);
		System.out.println("Reprovados="+re);
	}
}
