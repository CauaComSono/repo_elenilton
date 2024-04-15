package desconto;

import App.FolhaDePagamento;
import App.Funcionario;

public class FGTS {
    
        public double calculaFGTS(){
                Funcionario listaFuncionario = Funcionario.dadosFuncionario().get(0); 

                double FGTS;
                double salarioBruto = listaFuncionario.getSalarioBruto();
                
                FGTS = salarioBruto * 0.08;

                double salario = listaFuncionario.getAuxSalarioLiquido();
                
                return FGTS;
        }

}