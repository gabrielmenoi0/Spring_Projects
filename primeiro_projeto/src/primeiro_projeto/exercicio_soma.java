package primeiro_projeto;

import java.util.Scanner;

public class exercicio_soma {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		number1 = sc.nextInt();
		System.out.print("Digite outro valor: ");
		number2 = sc.nextInt();
		soma = number1+number2;
		System.out.printf("SOMA-> "+soma);
		
	}
	

}
