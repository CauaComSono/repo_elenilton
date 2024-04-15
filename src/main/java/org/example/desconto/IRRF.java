package desconto;

import App.FolhaDePagamento;
import App.Funcionario;

public class IRRF {
    
    public double calculaIRRF(){
        Funcionario listaFuncionario = Funcionario.dadosFuncionario().get(0); 
        double IRRF;
        
        double salarioBruto = listaFuncionario.getSalarioBruto();

        double salario = listaFuncionario.getAuxSalarioLiquido();
    
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