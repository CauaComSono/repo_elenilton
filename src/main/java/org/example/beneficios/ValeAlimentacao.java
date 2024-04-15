package beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Vale_Alimentacao {
   
   public double calcularValeAlimentacao() {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("Informe o valor diário do vale-alimentação: ");
        double valorDiarioVA = scanner.nextDouble();

        System.out.println("Informe o número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        double valorTotalVA = valorDiarioVA * diasTrabalhados;

        formatador.format(valorTotalVA);
        System.out.println("O valor total do vale-alimentação é: R$" + valorTotalVA);

        return valorTotalVA;
    }
}