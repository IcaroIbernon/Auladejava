package exceptionexe;
import java.util.Scanner;
public class Erros {
	public static int calcula(int num, int denom) {
		return num / denom;
}

public static void main(String[] args) throws ErroMenorZero, Erronaoint, ErroIgualZero {
	Scanner sc = new Scanner(System.in);
			System.out.println("Divisão apenas com numeros inteiros e maiores que zero:");
			System.out.print("Numerador: ");
			int numerador = sc.nextInt();
			test0(numerador);
			test2(numerador);
			System.out.print("Denominador: ");
			int denominador = sc.nextInt();
			test0(denominador);
			test2(numerador);
			test1(numerador,denominador);
			int resultador = calcula(numerador, denominador);
			System.out.println("Resultado: "+resultador);
	sc.close();
}

public static void test0(int valor) throws ErroMenorZero
{
      if(valor<0)
        throw new ErroMenorZero("Valor digitado menor que zero!");
}
public static void test1(int x,int y) throws Erronaoint
{
	if (x<y) {
        throw new Erronaoint("Resultado da divisão não inteiro!");
}
}
public static void test2(int valor) throws ErroIgualZero
{
      if(valor==0)
        throw new ErroIgualZero("Valor digitado igual a zero!");
}
}
