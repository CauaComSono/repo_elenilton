package org.example.beneficios;

import java.util.Scanner;

public class AdicionalTempoServico {

        public double valorAdicional;

    public double AdcionalTempo (boolean TemAdicional){
        
        Scanner scan = new Scanner(System.in);

        if(TemAdicional) {
            System.out.println("Quanto você recebe de adicional?");
            valorAdicional = scan.nextDouble();
        }
        else {
            System.out.println("Não tem adicional.");
        }
        return valorAdicional;
        
    }
    
}
