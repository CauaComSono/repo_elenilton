package org.example.beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFamilia {
    private Double salarioMinimo;
    private int filhos;
    private Double resposta;

    public double inseridoInss(boolean inss) {
        if (inss) {
            DecimalFormat df = new DecimalFormat("#0.00"); // Define o formato com duas casas decimais
            salarioMinimo = 1412.00;
            Scanner leitura = new Scanner(System.in);
    
            System.out.println("Quantos filhos com idade igual ou inferior a 14 anos?");
            filhos= leitura.nextInt();
            resposta =  (filhos * (salarioMinimo * 0.05));
        } else {
            resposta = 0.0;
        }
        return resposta;
    }
}