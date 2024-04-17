package org.example.App;

import org.example.beneficios.Beneficios;
import org.example.desconto.Descontos;

import java.util.List;

public class FolhaDePagamento {
    private double beneficios = 0.0;
    private double descontos = 0.0;

    public FolhaDePagamento() {}

    public double getBeneficios() {
        return beneficios;
    }

    public double getDescontos() {
        return descontos;
    }

    public double calcularSalarioLiquido(Funcionario funcionario, List<Beneficios> listaBeneficios, List<Descontos> listaDescontos){
        double salario = funcionario.getSalarioBruto();

        double valorBeneficios = calcularBeneficios(listaBeneficios);
        double valorDescontos = calcularDescontos(funcionario, listaBeneficios, listaDescontos);
        double salarioLiquido = salario - valorDescontos + valorBeneficios;

        return salarioLiquido;
    }

    public double calcularBeneficios(List<Beneficios> listaBeneficios) {
        for (Beneficios beneficio : listaBeneficios) {
            beneficios += beneficio.getValorHoraExtra();
            beneficios += beneficio.getValorTaxaNoturna();
            beneficios += beneficio.getValorInsalubridade();
            beneficios += beneficio.getValorPericulosidade();
            beneficios += beneficio.getValorSalarioFamilia();
            beneficios += beneficio.getValorDiaria();
            beneficios += beneficio.getAdicionaTempoServico();
            beneficios += beneficio.getAuxilioCreche();
        }

        return beneficios;
    }

    public double calcularDescontos(Funcionario funcionario, List<Beneficios> listaBeneficios, List<Descontos> listaDescontos){
        for (Descontos desconto : listaDescontos) {
            descontos += desconto.getFaltaAtraso();
            descontos += desconto.getFgts();
            descontos += desconto.getInss();
            descontos += desconto.getIrrf();
            descontos += desconto.getPensaoAlimenticia();
        }

        double salario = funcionario.getSalarioBruto();
        double valeAlimentacao = 0.0;
        double valeTransporte = 0.0;

        for (Beneficios beneficio : listaBeneficios) {
            valeAlimentacao += beneficio.getValorValeAlimentacao();
            valeTransporte += beneficio.getValorValeTransporte();
        }

        if (valeAlimentacao != 0.0) {
            descontos += salario * 0.1; // Aplica o desconto de 10% do salário bruto
        }

        if (valeTransporte != 0.0) {
            descontos += salario * 0.06; // Aplica o desconto de 6% do salário bruto
        }

        return descontos;
    }
}
