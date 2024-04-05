package beneficios;

<<<<<<< HEAD
public class Beneficio_periculosidade {
    
}
=======

public class Beneficio_periculosidade {

    public Double taxaPericulosidade;


    public Double BeneficioPerciulosidade (boolean TemPericulosidade){
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
>>>>>>> 1ae52f5c646b6d69aad2433a8cf8787f110e4e52
