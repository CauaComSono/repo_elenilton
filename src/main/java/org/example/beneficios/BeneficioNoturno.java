package org.example.beneficios;

public class BeneficioNoturno {
    
   public Double taxaNoturna;


    public Double calculoBeneficioNoturno (boolean TemBeneficioNoturno, double salario) {
        if (TemBeneficioNoturno) {
            
            taxaNoturna = salario * 0.2;
        }
        else {
            System.out.println("Não recebe beneficio de trabalho noturno.");
        }

        return taxaNoturna;
        
    }
    
}
