package beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Vale_transporte {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("Informe o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        final double aliquota = 0.06;

        double valorTotalVT = salarioBruto * aliquota;
        System.out.println("O valor total do vale-transporte é: R$" + formatador.format(valorTotalVT));

        scanner.close();
    }
}