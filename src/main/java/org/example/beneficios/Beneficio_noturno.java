package beneficios;

public class Beneficio_noturno {
    
   public Double taxaNoturna;


    public Double BeneficioNoturno (boolean TemBeneficioNoturno, double salario) {
        System.out.println("Você recebe Beneficio de trabalho Noturno?");
        if (TemBeneficioNoturno) {
            
            taxaNoturna = salario * 0.2;
        }
        else {
            System.out.println("Não recebe beneficio de trabalho noturno.");
        }

        return taxaNoturna;
        
    }
    
}
