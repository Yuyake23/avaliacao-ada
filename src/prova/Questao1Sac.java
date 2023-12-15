package prova;

import java.util.Locale;
import java.util.Scanner;

public class Questao1Sac {

    public static void main(String[] args) {
	Locale.setDefault(Locale.of("pt", "br"));
	System.out.println(
		"Utilize a notação brasileira para entrada de dados, ou seja, o separador de casas decimais é ','.");

	Scanner sc = new Scanner(System.in);
	double emprestimo, taxaJurosMensal;
	double amortizacaoMensal, saldoDevedor;
	double juros, prestacao;
	int tempo;
	double totalPrestacao = 0, totalJuros = 0;

	System.out.print("Qual o valor do empréstimo? R$: ");
	saldoDevedor = emprestimo = sc.nextDouble();

	System.out.print("Qual a taxa de juros mensal? (Para 2% digite '2'): ");
	taxaJurosMensal = sc.nextDouble() / 100;

	System.out.print("Deseja parcelar em quantos meses? ");
	tempo = sc.nextInt();
	sc.close();

	amortizacaoMensal = emprestimo / tempo;

	System.out.printf("%nValor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com juros de %.1f%% ao mês%n",
		amortizacaoMensal, saldoDevedor, taxaJurosMensal * 100);
	for (int i = 0; i < tempo; i++) {
	    juros = saldoDevedor * taxaJurosMensal;
	    prestacao = amortizacaoMensal + juros;
	    
	    totalJuros += juros;
	    totalPrestacao += prestacao;
	    saldoDevedor -= amortizacaoMensal;
	    
	    System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação R$ %.2f | Saldo devedor: R$ %.2f%n", i + 1,
		    juros, prestacao, saldoDevedor);
	}
	
	System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n",
		totalPrestacao, totalJuros, emprestimo);

    }

}
