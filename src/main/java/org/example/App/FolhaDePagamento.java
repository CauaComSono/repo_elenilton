package org.example.App;

import org.example.beneficios.Beneficios;
import org.example.desconto.Descontos;

public class FolhaDePagamento {

    Empresa listaEmpregadores;
    Funcionario listaFuncionario;
    Beneficios listaBeneficios;
    Descontos listaDescontos;

    public double calcularSalarioLiquido(){
        double salario = listaFuncionario.getSalarioBruto();

        double valorBeneficios = calcularBeneficios();
        double valorDescontos = calcularDescontos(salario);
        double salarioLiquido = salario - valorDescontos + valorBeneficios;

        return salarioLiquido;
    }
   
    private double calcularBeneficios() {
        double beneficios = 0.0;
        
        beneficios += listaBeneficios.getValorHoraExtra();
        beneficios += listaBeneficios.getValorTaxaNoturna();
        beneficios += listaBeneficios.getValorInsalubridade();
        beneficios += listaBeneficios.getValorPericulosidade();
        beneficios += listaBeneficios.getValorSalarioFamilia();
        beneficios += listaBeneficios.getValorDiaria();
        beneficios += listaBeneficios.getAdicionaTempoServico();
        beneficios += listaBeneficios.getAuxilioCreche();

        return beneficios;
    }

    private double calcularDescontos(double salario){
        double descontos = 0.0;
        
        descontos += listaDescontos.getFaltaAtraso();
        descontos += listaDescontos.getFgts();
        descontos += listaDescontos.getInss();
        descontos += listaDescontos.getIrrf();    
       // descontos += listaDescontos.getPensaoAlimenticia();

        double valeAlimentacao = listaBeneficios.getValorValeAlimentacao(); 
        if (valeAlimentacao != 0.0) {
            descontos += salario * 0.1; // Aplica o desconto de 10% do salário bruto
        }

        double valeTransporte = listaBeneficios.getValorValeTransporte();
        if (valeTransporte != 0.0) {
            descontos += salario * 0.06; // Aplica o desconto de 6% do salário bruto
        }

        return descontos;
    }
}
