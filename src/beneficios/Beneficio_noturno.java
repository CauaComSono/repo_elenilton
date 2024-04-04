package beneficios;

public class Beneficio_noturno {
    
    Double taxaNoturna;
    Double salarioComTaxaNoturna;

    public void BeneficioNoturno (boolean TemBeneficioNoturno) {
        System.out.println("Você recebe Beneficio de trabalho Noturno?");
        if (TemBeneficioNoturno) {
            
            taxaNoturna = (salario * 0.2);
            salarioComTaxaNoturna = salario + taxaNoturna;
        }
        else {
            System.out.println("Não recebe beneficio de trabalho noturno.");
        }
    }
    
}
