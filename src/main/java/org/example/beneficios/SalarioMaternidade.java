package org.example.beneficios;

public class SalarioMaternidade {
    private final double TAXA_SALARIO_MATERNIDADE = 0.8; // Taxa de substituição do salário durante o período de afastamento

    // Método para calcular o salário maternidade com base no salário da trabalhadora e na data de início do afastamento
    public  double calcularSalarioMaternidade(double salario, String sexo) {
        double salarioMaternidade = 0.0;
       
        if (sexo.equalsIgnoreCase("f")) {
       
            int duracaoSalarioMaternidadeDias = 120;
            salarioMaternidade = salario * TAXA_SALARIO_MATERNIDADE * duracaoSalarioMaternidadeDias;
   
        }else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Você não recebe salario maternidade");
            salarioMaternidade = 0.0;

        }else {
            System.out.println("informe o seu sexo:\n F = Feminino; \n M = Masculino;");
            calcularSalarioMaternidade(salario, sexo);
        }
    
        return salarioMaternidade;
    
    }

}