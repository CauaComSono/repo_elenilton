package org.example.desconto;

import org.example.App.FolhaDePagamento;
import org.example.App.Funcionario;

import java.util.Scanner;

public class INSS {
    
    public double calcularINSS(){
        Funcionario listaFuncionario = Funcionario.dadosFuncionario().get(0); 
        
        Scanner scanner = new Scanner(System.in);

        String participaINSS = "";

        System.out.println("O funcionário vai pagar INSS? (responda YES para sim e NO para não)");
        participaINSS = scanner.nextLine();
        
        if(participaINSS == "YES"){

            double INSS;
            double salarioBruto = listaFuncionario.getSalarioBruto();

            double salario = listaFuncionario.getAuxSalarioLiquido();
        
                if (salarioBruto >= 0 && salarioBruto <= 1751.81) {
                    INSS = salarioBruto * 0.08;
                } else if (salarioBruto <= 2919.72) {
                    INSS = salarioBruto * 0.09;
                } else if (salarioBruto <= 5839.45) {
                    INSS = salarioBruto * 0.11;
                } else {
                    INSS = 642.34;
                }
            
        return INSS;

        } else {
            return 0.0;
        }
    }
}