package beneficios;


public class Beneficio_periculosidade {

    Double taxaPericulosidade;
    Double salarcioComTaxaPericulosidade;


    public void BeneficioPerciulosidade (boolean TemPericulosidade){
        System.out.println("Você recebe beneficio de periculosidade?");

        if(TemPericulosidade){
            taxaPericulosidade = salario * 0.3;
            salarcioComTaxaPericulosidade = salario + taxaPericulosidade;
        }
        else{
            System.out.println("Não recebe Beneficio de periculosidade.");
        }

        
    }
    
}
