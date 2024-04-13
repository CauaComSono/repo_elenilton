package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolhaDePagamento {

    public static List<FolhaDePagamento> calcularFolhaPagamento() {
        List<FolhaDePagamento> resultadoFolhaDePagamentos = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
   
        Funcionario listaFuncionario = Funcionario.dadosFuncionario().get(0); 

     return resultadoFolhaDePagamentos;   
    }
}
/*
 *        if (!listaEmpregadores.isEmpty()) {
            System.out.println("=================================================== Dados do Empregador ===================================================");
            Empresa empregadorSelecionado = listaEmpregadores.get(0); // Apenas para ilustrar, considere a lógica adequada para manipular a lista
            System.out.println("\n Nome da empresa: " + empregadorSelecionado.getNome());
            System.out.println(" CNPJ: " + empregadorSelecionado.getCnpj());
            System.out.println(" Endereço: " + empregadorSelecionado.getEndereco());
            System.out.println(" Contato: " + empregadorSelecionado.getContato());
            System.out.println("\n ============================================================================================================================");
        }
 */