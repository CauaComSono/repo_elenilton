<<<<<<< HEAD:src/Empresa.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
=======
package App;

public class Empresa {
>>>>>>> 3fa98460cdf477984b889b088c62aa22d81728db:src/App/Empresa.java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;

    public Empresa(String nome, String cnpj, String endereco, String contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public static List<Empresa> dadosEmpregador() {
        List<Empresa> listaEmpregadores = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("========================================================================================"+
                            "\n Selecione se deseja escolher um empregador já cadastrado ou selecionar um novo:"+
                            "\n 1 - Sorveteria Gelado no Frio;"+
                            "\n 2 - Academia Musculação de Bolso;"+
                            "\n 3 - Pet Shop Miado Feliz;"+
                            "\n 4 - Cadastrar um novo;\n"+
                            "========================================================================================");
        int resposta = leitura.nextInt();
        leitura.nextLine(); // Consumir a quebra de linha pendente

        switch (resposta) {
            case 1:
                listaEmpregadores.add(new Empresa("Sorveteria Gelado no Frio", "123456789", "Avenida dos Congelados, 666", "geladonofrio@sorvetes.com"));
                break;

            case 2:
                listaEmpregadores.add(new Empresa("Academia Musculação de Bolso", "987654321", "Rua do Halteres, 123", "contato@musculacaodebolso.com"));
                break;

            case 3:
                listaEmpregadores.add(new Empresa("Pet Shop Miado Feliz", "567890123", "Travessa dos Gatos, 789", "miadofeliz@petshop.com"));
                break;

            case 4:
                System.out.println("Insira os dados do empregador:");
                System.out.print("Nome da empresa: ");
                String nome = leitura.nextLine();
                System.out.print("CNPJ: ");
                String cnpj = leitura.nextLine();
                System.out.print("Endereço: ");
                String endereco = leitura.nextLine();
                System.out.print("Contato: ");
                String contato = leitura.nextLine();
                listaEmpregadores.add(new Empresa(nome, cnpj, endereco, contato));
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        leitura.close();
        return listaEmpregadores;
    }
}
