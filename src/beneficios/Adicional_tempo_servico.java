package beneficios;

import java.util.Scanner;

public class Adicional_tempo_servico {

    double valorAdicional;
    double salarioComAdicional = 0;
    
    
    public void AdcionalTempo (boolean TemAdicional){
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Você recebe adicional de tempo de serviço? ");
        if(TemAdicional) {
            System.out.println("Quanto você recebe de adicional?");
            valorAdicional = scan.nextDouble();

              salarioComAdicional = salario + valorAdicional;
                //aqui teria que importar o salário da classe Funcionario para poder calcular
        }
        else {
            System.out.println("Não tem adicional.");
        }
    }
    
}
