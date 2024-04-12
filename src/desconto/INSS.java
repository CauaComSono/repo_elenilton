package desconto;

import App.FolhaDePagamento;
import java.util.Scanner;

public class INSS {
    
    public String calcularINSS(){
        
        Scanner scanner = new Scanner(System.in);

        String participaINSS = "";

        System.out.println("O funcionário vai pagar INSS? (responda YES para sim e NO para não)");
        participaINSS = scanner.nextLine();
        
        if(participaINSS == "YES"){

            double INSS;
            double salarioBruto = FolhaDePagamento.getValorBruto();

            double salario = FolhaDePagamento.getAuxSalarioLiquido();
        
                if (salarioBruto >= 0 && salarioBruto <= 1751.81) {
                    INSS = salarioBruto * 0.08;
                } else if (salarioBruto <= 2919.72) {
                    INSS = salarioBruto * 0.09;
                } else if (salarioBruto <= 5839.45) {
                    INSS = salarioBruto * 0.11;
                } else {
                    INSS = 642.34;
                }
    
        FolhaDePagamento.setAuxSalarioLiquido(salario - INSS);
        
        return Double.toString(INSS);

        } else {
            return "O funcionário não pagará INSS";
        }
    }
}