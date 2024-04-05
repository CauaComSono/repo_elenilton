package beneficios;

<<<<<<< HEAD
public class Beneficio_insalubridade {
    
}
=======
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
>>>>>>> 1ae52f5c646b6d69aad2433a8cf8787f110e4e52
