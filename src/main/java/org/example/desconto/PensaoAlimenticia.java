package org.example.desconto;

import java.util.Scanner;

public class PensaoAlimenticia {

    String grauPensaoAlimenticia;
    public Double pensaoAlimenticia = 0.0;


    public Double calculaPensaoAlimenticia(boolean temPensaoAlimenticia, double salario){

        Scanner scan = new Scanner(System.in);

        if (temPensaoAlimenticia){
            System.out.println("Qual o grau da Pensão Alimentícia?\n mínimo || médio || máximo");
            grauPensaoAlimenticia = scan.nextLine();

                if(grauPensaoAlimenticia == "minimo" || grauPensaoAlimenticia == "mínimo"){

                    pensaoAlimenticia = salario * 0.15;


                }
                else if(grauPensaoAlimenticia == "medio" || grauPensaoAlimenticia == "médio"){

                    pensaoAlimenticia = salario * 0.2;


                }
                else if(grauPensaoAlimenticia == "maximo" || grauPensaoAlimenticia == "máximo"){

                    pensaoAlimenticia = salario * 0.3;
                    
                    
                }          
            }
            else{
                System.out.println("Não paga Pensão Alimentícia.");
            }
            return pensaoAlimenticia;
             
        }






    }
