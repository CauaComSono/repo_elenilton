package beneficios;


public class Beneficio_periculosidade {

    public Double taxaPericulosidade;


    public Double BeneficioPerciulosidade (boolean TemPericulosidade, double salario){
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
