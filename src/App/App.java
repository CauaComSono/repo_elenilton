package App;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Empresa> listaEmpregadores = Empresa.dadosEmpregador();
        List<Funcionario> listaFuncionarios = Funcionario.dadosFuncionario();

        System.out.println(listaEmpregadores);
        System.out.println(listaFuncionarios);
    }
}

/*
         // Exibir os dados do empregador selecionado
        if (!listaEmpregadores.isEmpty()) {
            System.out.println("=================================================== Dados do Empregador ===================================================");
            Empresa empregadorSelecionado = listaEmpregadores.get(0); // Apenas para ilustrar, considere a lógica adequada para manipular a lista
            System.out.println("\n Nome da empresa: " + empregadorSelecionado.getNome());
            System.out.println(" CNPJ: " + empregadorSelecionado.getCnpj());
            System.out.println(" Endereço: " + empregadorSelecionado.getEndereco());
            System.out.println(" Contato: " + empregadorSelecionado.getContato());
            System.out.println("\n ============================================================================================================================");
        }
  
        // Exibir os dados do funcionário inserido
        if (!listaFuncionarios.isEmpty()) {
            System.out.println(
                    "=================================================== Dados do Funcionário ===================================================");
            Funcionario funcionario = listaFuncionarios.get(0); // Apenas para ilustrar, considere a lógica adequada
                                                                // para manipular a lista
            System.out.println("\n Nome completo: " + funcionario.getNomeCompleto());
            System.out.println(" CPF: " + funcionario.getCpf());
            System.out.println(" Cargo: " + funcionario.getCargo());
            System.out.println(" Função: " + funcionario.getFuncao());
            System.out.println(" Registro: " + funcionario.getRegistro());
            System.out.println(" Dias trabalhados: " + funcionario.getDiasTrabalhados());
            System.out.println(" Salário bruto: R$ " + funcionario.getSalarioBruto());
            System.out.println(" Contribuição sindical: R$ " + funcionario.getContribuicaoSindical());
            System.out.println(
                    "\n ============================================================================================================================");
        }
 */