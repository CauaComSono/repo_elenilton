package beneficios;

import java.util.Scanner;

public class Beneficio_insalubridade {

    String grauInsalubridade;
    Double taxaInsalubridade;
    Double salarioComTaxaInsalubridade;

    public void BeneficioInsalubridade(boolean TemInsalubridade){

        Scanner scan = new Scanner(System.in);

        if (TemInsalubridade){
            System.out.println("Qual o grau de insalubridade?");
            grauInsalubridade = scan.nextLine();

                if(grauInsalubridade == "minimo" || grauInsalubridade == "mínimo"){

                   taxaInsalubridade = salario * 0.1;
                   salarioComTaxaInsalubridade = salario + taxaInsalubridade;

                }
                else if(grauInsalubridade == "medio" || grauInsalubridade == "médio"){

                    taxaInsalubridade = salario * 0.2;
                    salarioComTaxaInsalubridade = salario + taxaInsalubridade;

                }
                else if(grauInsalubridade == "maximo" || grauInsalubridade == "máximo"){

                    taxaInsalubridade = salario * 0.4;
                    salarioComTaxaInsalubridade = salario + taxaInsalubridade;

                }          
        }
        else{
            System.out.println("Não tem taxa de insalubridade.");
        }
    }

    
}
