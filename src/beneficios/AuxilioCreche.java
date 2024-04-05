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
            leitura.close();
            return beneficio;
        } else {
            System.out.println("A colaboradora não recebe auxílio creche.");
            leitura.close(); 
            return 0.0; // Se não recebe auxílio creche, retorna 0.0
        }
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        AuxilioCreche auxilioCreche = new AuxilioCreche();

        System.out.println("Deseja calcular o auxílio creche? \n Sim/Não");
        String resposta = leitura.next();

        if(resposta.equalsIgnoreCase("Sim")){
            System.out.println("O benefício é de: " + auxilioCreche.calcularAuxilioCreche());
            leitura.close();
        } else {
            System.out.println("Encerrando o cálculo do auxílio creche.");
            leitura.close();
        }
    }
}