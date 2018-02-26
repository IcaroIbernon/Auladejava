package pratica1;

import java.util.Scanner;

public class Nona {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String nome,sexo,pv="fulano",mb="fulana";
		float peso,altura,mh=0,alturam=3;
		int idade=0,qp=0,qm=0,qj=0,qh=0,imv=0;
		do {
			System.out.println("Digite o nome:");
			nome=input.nextLine();
			System.out.println("Digite o sexo:");
			sexo=input.next();
			sexo=sexo.toUpperCase();
			if(!(sexo.equals("M"))&&!(sexo.equals("F"))){
				System.out.println("Sexo invalido.");
				while(!(sexo.equals("M"))||(sexo.equals("F"))) {
					System.out.println("Digite um sexo valido:[M/F]");
					sexo=input.next();
					sexo=sexo.toUpperCase();
				}
			}
			System.out.println("Digite o peso:");
			peso=input.nextFloat();
			System.out.println("Digite a idade:");
			idade=input.nextInt();
			System.out.println("Digite a altura:");
			altura=input.nextFloat();
			input.nextLine();
			if(nome.equalsIgnoreCase("fim")==false) {
				qp=qp+1;//quantidade de pacientes
				if((idade>=18)&&(idade<=25)) {
					qj=qj+1;//idade dos jovens
				}
				if(imv<idade) {
					imv=idade;//nome do mais velho
					pv=nome;
				}
				if(sexo.equals("M")) {
					qh=qh+1;
					mh=mh+idade;//media dos homems
				}else {
				if((altura>=1.6)&&(altura<=1.7)&&(peso<70)){
					qm=qm+1;//quantidade de mulheres aceitas
				}
				if(altura<alturam) {
					alturam=altura;//nome da menor mulher
					mb=nome;
				}
			}
			
	}
		}while(nome.equalsIgnoreCase("fim")==false);
		System.out.println("Quantidade de Pacientes:"+qp);
		System.out.println("Media da idade dos homens:"+(mh/qh));
		System.out.println("A quantidade de mulheres da especificação:"+qm);
		System.out.println("A quantidade de pessoas entre 18 e 25:"+qj);
		System.out.println("Nome do mais velho:"+pv);
		System.out.println("Nome da mais baixa:"+mb);
		input.close();
	}
}

