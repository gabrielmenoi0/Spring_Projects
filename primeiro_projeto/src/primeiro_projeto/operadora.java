package primeiro_projeto;

import java.util.Scanner;

public class operadora {
	public static void main(String[] args) {
		int minutos = 0;
		double valor = 0.0;
		int minutosExtras = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os minutos consumidos: ");
		minutos = sc.nextInt();
		if(minutos<=100){
			valor = 50.0;
			System.out.printf("Valor a pagar: R$"+valor);
		}else {
			minutosExtras = minutos-100;
			valor = minutosExtras *2+50;
			System.out.printf("Valor a pagar: R$"+valor);
		}
	}

}
