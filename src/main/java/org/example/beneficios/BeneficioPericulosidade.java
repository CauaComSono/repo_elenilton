package org.example.beneficios;


public class BeneficioPericulosidade {

    public Double taxaPericulosidade;


    public Double calculoBeneficioPerciulosidade (boolean TemPericulosidade, double salario){
        System.out.println("Você recebe beneficio de periculosidade?");

        if(TemPericulosidade){
            taxaPericulosidade = salario * 0.3;
        }
        else{
            System.out.println("Não recebe Beneficio de periculosidade.");
        }

        return taxaPericulosidade;
        
    }
    
}
