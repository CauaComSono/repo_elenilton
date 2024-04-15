package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private String contato;

    public Empresa(String razaoSocial, String cnpj, String endereco, String contato) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
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
                System.out.print("Razão Social da empresa: ");
                String razaoSocial = leitura.nextLine();
                System.out.print("CNPJ: ");
                String cnpj = leitura.nextLine();
                System.out.print("Endereço: ");
                String endereco = leitura.nextLine();
                System.out.print("Contato: ");
                String contato = leitura.nextLine();
                listaEmpregadores.add(new Empresa(razaoSocial, cnpj, endereco, contato));
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        return listaEmpregadores;
    }
}
