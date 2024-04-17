package org.example.App;

import java.util.List;
import java.util.Scanner;

import org.example.beneficios.Beneficios;
import org.example.desconto.Descontos;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Empresa> listaEmpregadores = Empresa.dadosEmpregador();
        List<Funcionario> listaFuncionarios = Funcionario.dadosFuncionario();
        List<Beneficios> listaBeneficios = Beneficios.valoresBeneficios(listaFuncionarios);
        List<Descontos> listaDescontos = Descontos.valoresDescontos(listaFuncionarios);

        Funcionario funcionario = listaFuncionarios.get(0);
        Empresa empregadorSelecionado = listaEmpregadores.get(0);
        Beneficios beneficio = listaBeneficios.get(0);
        Descontos desconto = listaDescontos.get(0);

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        boolean validador = false;
        while (!validador){

            System.out.println(
                    "============================================================================================================================\n"+
                            "                                     Escolha o que deseja fazer a seguir:\n"+
                            "\n1 - Visualizar empregador;"+
                            "\n2 - Visualizar cadastro do funcionario;"+
                            "\n3 - Lista de descontos;"+
                            "\n4 - Lista de beneficios; " +
                            "\n5 - Resumo folha de pagamento;" +
                            "\n6 - Sair;"+
                            "\n\n Informar apenas numeros inteiros."+
                            "\n============================================================================================================================");
            int respostaInicial = leitura.nextInt();
            switch (respostaInicial) {
                case 1:
                    if (!listaEmpregadores.isEmpty()) {
                        System.out.println("============================================ Dados do Empregador ===================================================");

                        System.out.println("\n Nome da empresa: " + empregadorSelecionado.getRazaoSocial());
                        System.out.println(" CNPJ: " + empregadorSelecionado.getCnpj());
                        System.out.println(" Endereço: " + empregadorSelecionado.getEndereco());
                        System.out.println(" Contato: " + empregadorSelecionado.getContato());
                        System.out.println("\n==================================================================================================================");
                    }else{
                        System.out.println("Sem informação do empregador, tente novamente.");
                    }
                    break;
                case 2:
                    if (!listaFuncionarios.isEmpty()) {
                        System.out.println(
                                "=================================================== Dados do Funcionário ===================================================");

                        System.out.println("\n Nome completo: " + funcionario.getNomeCompleto());
                        System.out.println(" CPF: " + funcionario.getCpf());
                        System.out.println(" Cargo: " + funcionario.getCargo());
                        System.out.println(" Função: " + funcionario.getFuncao());
                        System.out.println(" Registro: " + funcionario.getRegistro());
                        System.out.println(" Dias trabalhados: " + funcionario.getDiasTrabalhados());
                        System.out.println(" Salário bruto: R$ " + funcionario.getSalarioBruto());
                        System.out.println(" Contribuição sindical: R$ " + funcionario.getContribuicaoSindical());
                        System.out.println(
                                "\n============================================================================================================================");
                    }else{
                        System.out.println("Sem informação do funcionario, tente novamente.");
                    }
                    break;
                case 3:
                    if (!listaBeneficios.isEmpty()) {
                        System.out.println("================================================= Dados de Beneficio =================================================");
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
                        System.out.println("=======================================================================================================================");
                    } else {
                        System.out.println("Não há beneficios a serem exibidos.");
                    }
                    break;
                case 4:
                    if (!listaDescontos.isEmpty()) {
                        System.out.println("================================================= Dados de Descontos =================================================");
                        System.out.println("Falta ou Atraso: " + desconto.getFaltaAtraso());
                        System.out.println("FGTS: " + desconto.getFgts());
                        System.out.println("INSS: " + desconto.getInss());
                        System.out.println("IRRF: " + desconto.getIrrf());
                        System.out.println("Pensão Alimentícia: " + desconto.getPensaoAlimenticia());
                        System.out.println("=======================================================================================================================");
                    } else {
                        System.out.println("Não há descontos a serem exibidos.");
                    }
                    break;
                case 5:
                    double salarioLiquido = folhaDePagamento.calcularSalarioLiquido(funcionario, listaBeneficios, listaDescontos);
                    System.out.println(
                            "================================================== Resumo folha de pagamento =================================================="+
                                    "\n Empregador: " + empregadorSelecionado.getRazaoSocial()  +
                                    "\n Funcionario: " + funcionario.getNomeCompleto() +
                                    "\n\n Salario Bruto: " + funcionario.getSalarioBruto() +
                                    "\n\n          Descontos: " + folhaDePagamento.getDescontos() +
                                    "\n          Beneficios: " + folhaDePagamento.getBeneficios() +
                                    "\n\n Salario Liquido: " + salarioLiquido +

                                    "\n Outros beneficios: \n"+
                                    "\nVale alimentação: " + beneficio.getValorValeAlimentacao() +
                                    "\nVale Transporte: " + beneficio.getValorValeTransporte()+
                                    "\n============================================================================================================================");
                    break;
                case 6:
                    validador = true;
                    break;
                default:
                    System.out.println("opção invalida.");
                    break;
            }
        }

    }
}
