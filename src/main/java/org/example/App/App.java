package org.example.App;

import java.util.List;
import java.util.Scanner;

import org.example.beneficios.Beneficios;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Empresa> listaEmpregadores = Empresa.dadosEmpregador();
        List<Funcionario> listaFuncionarios = Funcionario.dadosFuncionario();
        List<Beneficios> listaBeneficios = Beneficios.valoresBeneficios();

       // System.out.println(listaEmpregadores);
        //System.out.println(listaFuncionarios);


    }
}


/*
        for (Beneficios beneficio : listaBeneficios) {
            System.out.println("Adiantamento: " + beneficio.getAdiantamento());
            System.out.println("Adicional de Tempo de Serviço: " + beneficio.getAdicionaTempoServico());
            System.out.println("Auxílio Creche: " + beneficio.getAuxilioCreche());
            System.out.println("Valor Insalubridade: " + beneficio.getValorInsalubridade());
            System.out.println("Valor Taxa Noturna: " + beneficio.getValorTaxaNoturna());
            System.out.println("Valor Periculosidade: " + beneficio.getValorPericulosidade());
            System.out.println("Valor DSR: " + beneficio.getValorDsr());
            System.out.println("Valor Diária: " + beneficio.getValorDiaria());
            System.out.println("Valor Hora Extra: " + beneficio.getValorHoraExtra());
            System.out.println("Valor Salário Família: " + beneficio.getValorSalarioFamilia());
            System.out.println("Valor Salário Maternidade: " + beneficio.getValorSalarioMaternidade());
            System.out.println("Valor Vale Alimentação: " + beneficio.getValorValeAlimentacao());
            System.out.println("Valor Vale Transporte: " + beneficio.getValorValeTransporte());
        }
    for (Beneficios beneficio : listaBeneficios) {
            System.out.println("Adiantamento: " + beneficio.getAdiantamento());
            System.out.println("Adicional de Tempo de Serviço: " + beneficio.getAdicionaTempoServico());
            System.out.println("Auxílio Creche: " + beneficio.getAuxilioCreche());
            System.out.println("Valor Insalubridade: " + beneficio.getValorInsalubridade());
            System.out.println("Valor Taxa Noturna: " + beneficio.getValorTaxaNoturna());
            System.out.println("Valor Periculosidade: " + beneficio.getValorPericulosidade());
            System.out.println("Valor DSR: " + beneficio.getValorDsr());
            System.out.println("Valor Diária: " + beneficio.getValorDiaria());
            System.out.println("Valor Hora Extra: " + beneficio.getValorHoraExtra());
            System.out.println("Valor Salário Família: " + beneficio.getValorSalarioFamilia());
            System.out.println("Valor Salário Maternidade: " + beneficio.getValorSalarioMaternidade());
            System.out.println("Valor Vale Alimentação: " + beneficio.getValorValeAlimentacao());
            System.out.println("Valor Vale Transporte: " + beneficio.getValorValeTransporte());
        }


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