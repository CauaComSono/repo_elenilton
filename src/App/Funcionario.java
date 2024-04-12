<<<<<<< HEAD:src/Funcionario.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
=======
package App;
>>>>>>> 3fa98460cdf477984b889b088c62aa22d81728db:src/App/Funcionario.java

public class Funcionario {
    private String nomeCompleto;
    private String cpf;
    private String cargo;
    private String funcao;
    private String registro;
    private int diasTrabalhados;
    private double salarioBruto;
    private double contribuicaoSindical;

    public Funcionario(String nomeCompleto, String cpf, String cargo, String funcao, String registro,
                       int diasTrabalhados, double salarioBruto, double contribuicaoSindical) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cargo = cargo;
        this.funcao = funcao;
        this.registro = registro;
        this.diasTrabalhados = diasTrabalhados;
        this.salarioBruto = salarioBruto;
        this.contribuicaoSindical = contribuicaoSindical;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getRegistro() {
        return registro;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getContribuicaoSindical() {
        return contribuicaoSindical;
    }

    public static List<Funcionario> dadosFuncionario() {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("========================================================================================" +
                "\n Selecione se deseja escolher um funcionaro já cadastrado ou selecionar um novo:" +
                "\n 1 - Maria Santos;" +
                "\n 2 - João da Silva;" +
                "\n 3 - Carlos Roberto;" +
                "\n 4 - Cadastrar um novo;\n" +
                "========================================================================================");
        int resposta = leitura.nextInt();
        switch (resposta) {
            case 1:
                listaFuncionarios.add(new Funcionario("Maria Santos", "987.654.321-00", "Ninja de Programação",
                        "Desenvolver soluções invisíveis", "2022002", 20, 3000.0, 100.0));
                break;

            case 2:
                listaFuncionarios.add(new Funcionario("João da Silva", "123.456.789-00", "Gerente de Felicidade",
                        "Fazer as pessoas sorrirem", "2022001", 22, 3500.0, 120.0));
                break;

            case 3:
                listaFuncionarios.add(new Funcionario("Carlos Roberto", "456.789.123-00", "Mestre Churrasqueiro",
                        "Transformar carne em poesia", "2022003", 18, 2800.0, 90.0));
                break;

            case 4:
                System.out.print("Nome completo: ");
                leitura.nextLine(); // Limpar o buffer do scanner
                String nome = leitura.nextLine();
                System.out.print("CPF: ");
                String cpf = leitura.nextLine();
                System.out.print("Cargo: ");
                String cargo = leitura.nextLine();
                System.out.print("Função: ");
                String funcao = leitura.nextLine();
                System.out.print("Registro: ");
                String registro = leitura.nextLine();
                System.out.print("Número de dias trabalhados: ");
                int diasTrabalhados = leitura.nextInt();
                System.out.print("Valor bruto do salário: R$ ");
                double salarioBruto = leitura.nextDouble();
                System.out.print("Contribuição sindical: R$ ");
                double contribuicaoSindical = leitura.nextDouble();

                listaFuncionarios.add(new Funcionario(nome, cpf, cargo, funcao, registro, diasTrabalhados, salarioBruto, contribuicaoSindical));
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        leitura.close();
        return listaFuncionarios;
    }
}
