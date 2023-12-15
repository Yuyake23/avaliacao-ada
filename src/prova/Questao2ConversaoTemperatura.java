package prova;

import java.util.Locale;
import java.util.Scanner;

public class Questao2ConversaoTemperatura {

    public static void main(String[] args) {
	Locale.setDefault(Locale.of("pt", "br"));
	System.out.println(
		"Utilize a notação brasileira para entrada de dados, ou seja, o separador de casas decimais é ','.");

	Scanner sc = new Scanner(System.in);
	double temperaturaOriginal, temperaturaConvertida;
	double temperaturaK;
	char origem, destino;

	System.out.print("Informe a temperatura: ");
	temperaturaOriginal = sc.nextDouble();
	sc.nextLine();

	System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F]: ");
	origem = sc.nextLine().toUpperCase().trim().charAt(0);
	System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F]: ");
	destino = sc.nextLine().toUpperCase().trim().charAt(0);
	sc.close();

	try {
	    temperaturaK = switch (origem) {
	    case 'C' -> temperaturaOriginal + 273.15;
	    case 'K' -> temperaturaOriginal;
	    case 'F' -> (temperaturaOriginal - 32) * 5 / 9 + 273.15;
	    default -> throw new IllegalArgumentException(origem + " não é uma unidade válida!");
	    };

	    temperaturaConvertida = switch (destino) {
	    case 'C' -> temperaturaK - 273.15;
	    case 'K' -> temperaturaK;
	    case 'F' -> (temperaturaK - 273.15) * 9 / 5 + 32;
	    default -> throw new IllegalArgumentException(destino + " não é uma unidade válida!");
	    };

	    System.out.printf("%.2f %c = %.2f %c%n", temperaturaOriginal, origem, temperaturaConvertida, destino);
	} catch (IllegalArgumentException e) {
	    System.out.println(e.getLocalizedMessage());
	}

    }

}
