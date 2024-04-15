package beneficios;

import java.util.Scanner;

public class AuxilioCreche {
    private Double beneficio;

    public Double calcularAuxilioCreche(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Colaboradora recebe auxílio creche? \n Sim/Não");
        String resposta = leitura.next();

        if(resposta.equalsIgnoreCase("Sim")){
            System.out.println("Qual o valor do benefício?");
            beneficio = leitura.nextDouble();
            return beneficio;
        } else {
            System.out.println("A colaboradora não recebe auxílio creche.");
            return 0.0; // Se não recebe auxílio creche, retorna 0.0
        }
    }
}