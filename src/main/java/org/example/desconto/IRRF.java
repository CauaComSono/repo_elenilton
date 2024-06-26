package org.example.desconto;

import org.example.App.FolhaDePagamento;
import org.example.App.Funcionario;

import java.util.List;

public class IRRF {
    
    public double calculaIRRF(List<Funcionario> listaFuncionarios){
        Funcionario funcionario = listaFuncionarios.get(0);
        double IRRF;
        
        double salarioBruto = funcionario.getSalarioBruto();
    
            if (salarioBruto <= 1903.98) {
                IRRF = 0;
            } else if (salarioBruto <= 2826.65) {
                IRRF = salarioBruto * 0.075 - 142.80;
            } else if (salarioBruto <= 3751.05) {
                IRRF = salarioBruto * 0.15 - 354.80;
            } else if (salarioBruto <= 4664.68) {
                IRRF = salarioBruto * 0.225 - 636.13;
            } else {
                IRRF = salarioBruto * 0.275 - 869.36;
            }

        return IRRF;
    }
}