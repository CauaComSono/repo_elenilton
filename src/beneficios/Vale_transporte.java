package beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Vale_transporte {
    public double calcularValeTransporte(double salario) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        final double aliquota = 0.06;

        double valorTotalVT = salario * aliquota;

        formatador.format(valorTotalVT);
        System.out.println("O valor total do vale-transporte é: R$" +valorTotalVT);

        scanner.close();
        return valorTotalVT;
    }
}