package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Digite valor de a: ");
		a = input.nextInt();
		System.out.print("Digite valor de b: ");
		b = input.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
	}
	
	public static int soma(int a,int b) {
		return a + b;
	}
	public static int subtracao(int a,int b) {
		return a - b;
	}
	public static int multiplicacao(int a,int b) {
		return a * b;
	}
	public static int divisao(int a,int b) {
		return a / b;
	}
	
}
