package primeiro_projeto;
import java.util.Scanner;

public class weekDays {
	public static void main(String[] args) {
		String day = "0";
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor para do dia:");
		day = sc.next();
		switch(day) {
		case "1":
			System.out.print("Domingo");
			break;
		case "2":
			System.out.print("Segunda");
			break;
		case "3":
			System.out.print("Terça");
			break;
		case "4":
			System.out.print("Quarta");
			break;
		case "5":
			System.out.print("Quinta");
			break;
		case "6":
			System.out.print("Sexta");
			break;
		case "7":
			System.out.print("Sabado");
			break;
		default:
			System.out.print("Dia inválido");
		
		}
		
		
	}
}
