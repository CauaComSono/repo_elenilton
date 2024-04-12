package desconto;

import App.FolhaDePagamento;

public class IRRF {
    
    public String calculaIRRF(){
        
        double IRRF;
        
        double salarioBruto = FolhaDePagamento.getValorBruto();

        double salario = FolhaDePagamento.getAuxSalarioLiquido();
    
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

        FolhaDePagamento.setAuxSalarioLiquido(salario - IRRF);

        return Double.toString(IRRF);
    }
}