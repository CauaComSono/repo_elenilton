package org.example.beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class HoraExtra {
    //Classe Main apenas para teste
    public double calcularHoraExtra(double salario ) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

      
        int horasTrabalhadasMensal;
        int horasExtrasTrabalhadas;
        int horasExtrasTrabalhadasFeriado;

        formatador.format(salario);

        System.out.println("Informe a quantidade de horas trabalhadas no mês");
        horasTrabalhadasMensal = scanner.nextInt();

        System.out.println("Informe a quantidade de horas extras trabalhadas em dias comuns (exceto feriados)");
        horasExtrasTrabalhadas = scanner.nextInt();

        System.out.println("Informe a quantidade de horas extras trabalhadas em feriados");
        horasExtrasTrabalhadasFeriado = scanner.nextInt();

        final double adicionalNormal = 1.5;
        final double adicionalFeriado = 2.0;

        double valorHoraNormal = salario / horasTrabalhadasMensal;
        double valorHoraExtra = valorHoraNormal * adicionalNormal; 
        double valorHoraExtraFeriado = valorHoraNormal * adicionalFeriado;

        double somaHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;
        double somaHorasExtrasFeriado = horasExtrasTrabalhadasFeriado * valorHoraExtraFeriado;
        double totalHorasExtras = somaHorasExtras + somaHorasExtrasFeriado;

        System.out.println("Valor a receber por horas extras referente a dias comuns: R$" + formatador.format(somaHorasExtras));
        System.out.println("Valor a receber por horas extras referente a feriados: R$" + formatador.format(somaHorasExtrasFeriado));
        System.out.println("Valor total a receber por horas extras: R$" +  formatador.format(totalHorasExtras));

        return totalHorasExtras;
    }
}
