package beneficios;

import java.util.Scanner;

public class Adicional_tempo_servico {

        public double valorAdicional;

    public double AdcionalTempo (boolean TemAdicional){
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Você recebe adicional de tempo de serviço? ");
        if(TemAdicional) {
            System.out.println("Quanto você recebe de adicional?");
            valorAdicional = scan.nextDouble();
        }
        else {
            System.out.println("Não tem adicional.");
        }

        return valorAdicional;
        
    }
    
}
