package org.example.desconto;

import org.example.App.FolhaDePagamento;
import org.example.App.Funcionario;

import java.util.List;

public class FGTS {
    
        public double calculaFGTS(List<Funcionario> listaFuncionarios){
                Funcionario funcionario = listaFuncionarios.get(0);

                double FGTS;
                double salarioBruto = funcionario.getSalarioBruto();
                
                FGTS = salarioBruto * 0.08;

                return FGTS;
        }
}