package beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hora_extra {
    //Classe Main apenas para teste
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        double salarioBruto;
        int horasTrabalhadasMensal;
        int horasExtrasTrabalhadas;
        int horasExtrasTrabalhadasFeriado;

        System.out.println("Informe é o salário bruto recebido");
        salarioBruto = scanner.nextDouble();
        formatador.format(salarioBruto);

        System.out.println("Informe a quantidade de horas trabalhadas no mês");
        horasTrabalhadasMensal = scanner.nextInt();

        System.out.println("Informe a quantidade de horas extras trabalhadas em dias comuns (exceto feriados)");
        horasExtrasTrabalhadas = scanner.nextInt();

        System.out.println("Informe a quantidade de horas extras trabalhadas em feriados");
        horasExtrasTrabalhadasFeriado = scanner.nextInt();

        final double adicionalNormal = 1.5;
        final double adicionalFeriado = 2.0;

        double valorHoraNormal = salarioBruto / horasTrabalhadasMensal;
        double valorHoraExtra = valorHoraNormal * adicionalNormal; 
        double valorHoraExtraFeriado = valorHoraNormal * adicionalFeriado;

        double somaHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;
        double somaHorasExtrasFeriado = horasExtrasTrabalhadasFeriado * valorHoraExtraFeriado;
        double totalHorasExtras = somaHorasExtras + somaHorasExtrasFeriado;

        System.out.println("Valor a receber por horas extras referente a dias comuns: R$" + formatador.format(somaHorasExtras));
        System.out.println("Valor a receber por horas extras referente a feriados: R$" + formatador.format(somaHorasExtrasFeriado));
        System.out.println("Valor total a receber por horas extras: R$" +  formatador.format(totalHorasExtras));

        scanner.close();
    }
}
