package beneficios;

import java.util.Scanner;

public class Beneficio_insalubridade {

    String grauInsalubridade;
    public Double taxaInsalubridade;


    public Double BeneficioInsalubridade(boolean TemInsalubridade){

        Scanner scan = new Scanner(System.in);

        if (TemInsalubridade){
            System.out.println("Qual o grau de insalubridade?");
            grauInsalubridade = scan.nextLine();

                if(grauInsalubridade == "minimo" || grauInsalubridade == "mínimo"){

                   taxaInsalubridade = salario * 0.1;


                }
                else if(grauInsalubridade == "medio" || grauInsalubridade == "médio"){

                    taxaInsalubridade = salario * 0.2;


                }
                else if(grauInsalubridade == "maximo" || grauInsalubridade == "máximo"){

                    taxaInsalubridade = salario * 0.4;
                    
                    
                }          
            }
            else{
                System.out.println("Não tem taxa de insalubridade.");
            }
            
            return taxaInsalubridade;
             
        }
    }
