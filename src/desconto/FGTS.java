package desconto;

import App.FolhaDePagamento;

public class FGTS {
    
        public String calculaFGTS(){

                double FGTS;

                double salarioBruto = FolhaDePagamento.getValorBruto();
                
                FGTS = salarioBruto * 0.08;

                double salario = FolhaDePagamento.getAuxSalarioLiquido();
                
                FolhaDePagamento.setAuxSalarioLiquido(salario-FGTS);

                return Double.toString(FGTS);
        }

}