package beneficios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFamilia {
    private Double salarioMinimo;
    private int filhos;
    private String resposta;

    public String inseridoInss(boolean inss) {
        if (inss) {
            DecimalFormat df = new DecimalFormat("#0.00"); // Define o formato com duas casas decimais
            resposta = df.format(calcularSalarioFamilia());
        } else {
            resposta = "O colaborador não está inserido no INSS/não recebe o benefício";
        }
        return resposta;
    }

    public Double calcularSalarioFamilia(){
        salarioMinimo = 1412.00;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Quantos filhos com idade igual ou inferior a 14 anos?");
        filhos= leitura.nextInt();
        leitura.close();
        return  filhos * (salarioMinimo * 0.05);
        
    }
}