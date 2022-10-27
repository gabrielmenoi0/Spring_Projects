package primeiro_projeto;

import java.util.Scanner;

public class area_circulo {
	public static void main(String[] args) {
		double value = 0.0;
		double valueFinal = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		value = sc.nextFloat();
		valueFinal = 3.14159 * Math.pow(value, value);
		System.out.printf("Área do circulo-> "+valueFinal);

	}

}
