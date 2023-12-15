package prova;

import java.util.Locale;
import java.util.Scanner;

public class Questao3Triangulo {

    public static void main(String[] args) {
	Locale.setDefault(Locale.of("pt", "br"));
	System.out.println(
		"Utilize a notação brasileira para entrada de dados, ou seja, o separador de casas decimais é ','.");

	Scanner sc = new Scanner(System.in);
	int num, i;

	System.out.print("Digite um número: ");
	num = sc.nextInt();
	sc.close();

	if (num % 2 == 0) {
	    num++;
	    System.out.println("Número par identificado, vamos prosseguir com o número " + num);
	}

	for (i = 1; i < num + 1; i += 2) {
	    System.out.printf("%" + (num + i) / 2 + "s%n", "*".repeat(i));
	}

	System.out.println();
	for (i = 1; i < num + 1; i += 2) {
	    System.out.printf("%" + (num + i) / 2 + "s%n", "*".repeat(i));
	}
	while ((i -= 2) >= 1) {
	    System.out.printf("%" + (num + i) / 2 + "s%n", "*".repeat(i));
	}
    }

}
