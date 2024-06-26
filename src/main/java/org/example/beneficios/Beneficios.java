package org.example.beneficios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.App.Funcionario;

public class Beneficios {
        private double adiantamento;
        private double adicionaTempoServico;
        private double auxilioCreche;
        private double valorInsalubridade;
        private double valorTaxaNoturna;
        private double valorPericulosidade;
        private double valorDsr;
        private double valorDiaria;
        private double valorHoraExtra;
        private double valorSalarioFamilia;
        private double valorSalarioMaternidade;
        private double valorValeAlimentacao;
        private double valorValeTransporte;
    
        // Construtor
        public Beneficios(double adiantamento, double adicionaTempoServico, double auxilioCreche, 
                         double valorInsalubridade, double valorTaxaNoturna, double valorPericulosidade, 
                         double valorDsr, double valorDiaria, double valorHoraExtra, double valorSalarioFamilia, 
                         double valorSalarioMaternidade, double valorValeAlimentacao, double valorValeTransporte) {
            this.adiantamento = adiantamento;
            this.adicionaTempoServico = adicionaTempoServico;
            this.auxilioCreche = auxilioCreche;
            this.valorInsalubridade = valorInsalubridade;
            this.valorTaxaNoturna = valorTaxaNoturna;
            this.valorPericulosidade = valorPericulosidade;
            this.valorDsr = valorDsr;
            this.valorDiaria = valorDiaria;
            this.valorHoraExtra = valorHoraExtra;
            this.valorSalarioFamilia = valorSalarioFamilia;
            this.valorSalarioMaternidade = valorSalarioMaternidade;
            this.valorValeAlimentacao = valorValeAlimentacao;
            this.valorValeTransporte = valorValeTransporte;
        }
    
        public double getAdiantamento() {
            return adiantamento;
        }
    
        public double getAdicionaTempoServico() {
            return adicionaTempoServico;
        }
    
        public double getAuxilioCreche() {
            return auxilioCreche;
        }
    
        public double getValorInsalubridade() {
            return valorInsalubridade;
        }
    
        public double getValorTaxaNoturna() {
            return valorTaxaNoturna;
        }
    
        public double getValorPericulosidade() {
            return valorPericulosidade;
        }
    
        public double getValorDsr() {
            return valorDsr;
        }
    
        public double getValorDiaria() {
            return valorDiaria;
        }
    
        public double getValorHoraExtra() {
            return valorHoraExtra;
        }
    
        public double getValorSalarioFamilia() {
            return valorSalarioFamilia;
        }
    
        public double getValorSalarioMaternidade() {
            return valorSalarioMaternidade;
        }
    
        public double getValorValeAlimentacao() {
            return valorValeAlimentacao;
        }
    
        public double getValorValeTransporte() {
            return valorValeTransporte;
        }
    
    public static List<Beneficios> valoresBeneficios(List<Funcionario> listaFuncionarios) {
        List<Beneficios> listaBeneficios = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
        Funcionario funcionario = listaFuncionarios.get(0);

        double salario = funcionario.getSalarioBruto();

        String sexo = funcionario.getSexo();

        Adiantamento adiantamento = new Adiantamento();
        System.out.print("Recebe adiantamento (true/false): ");
        String adiantamentoStr = leitura.nextLine();
        boolean recebeAdiantamento = false;
        if (adiantamentoStr.equalsIgnoreCase("true") || adiantamentoStr.equalsIgnoreCase("false")) {
            recebeAdiantamento = Boolean.parseBoolean(adiantamentoStr);
        } else {
            System.out.println("Valor inválido para adiantamento. Usando o valor padrão: false.");
        }
        double valorAdiantamento  = adiantamento.calcularValorAdiantamento(recebeAdiantamento, salario);

        System.out.println("Você recebe adicional de tempo de serviço? true/false");
        boolean recebeAdicional = leitura.nextBoolean();
        AdicionalTempoServico  adicionalServico = new AdicionalTempoServico();
        double adicionaTempoServico = adicionalServico.AdcionalTempo(recebeAdicional);

        AuxilioCreche creche = new AuxilioCreche();
        double auxilioCreche = creche.calcularAuxilioCreche();

        System.out.println("Você recebe Benefício de Insalubridade? true/false");
        BeneficioInsalubridade insalubridade = new BeneficioInsalubridade();
        boolean recebeInsalubridade = leitura.nextBoolean();
        double valorInsalubridade = insalubridade.calculoBeneficioInsalubridade(recebeInsalubridade,salario);

        System.out.println("Você recebe adicional de horario noturno?true/false");
        BeneficioNoturno bonusNoturno = new BeneficioNoturno();
        boolean recebeTaxaNoturna = leitura.nextBoolean();
        double valorTaxaNoturna = bonusNoturno.calculoBeneficioNoturno(recebeTaxaNoturna,salario);

        
        System.out.println("Você recebe o valor de periculosidade? true/false");
        BeneficioPericulosidade periculosidade = new BeneficioPericulosidade();
        boolean recebePericulosidade = leitura.nextBoolean();
        double valorpericulosidade = periculosidade.calculoBeneficioPerciulosidade(recebePericulosidade,salario);

        System.out.println("Você cumpriu a sua jornada mensal? true/false");
        DescansoRemunerado dsr = new DescansoRemunerado();
        boolean recebeDsr = leitura.nextBoolean();
        double valorDsr = dsr.calcularRepousoSemanal(recebeDsr,salario);

        System.out.println("quantos dias ficou de viagem?");
        DiariaViagem diariaViagem = new DiariaViagem();
        int diasDeViagem = leitura.nextInt();
        double valorDiaria = diariaViagem.calcularValorDiarias(diasDeViagem);

        HoraExtra horaExtra = new HoraExtra();
        double valorHoraExtra = horaExtra.calcularHoraExtra(salario);

        System.out.println("recebe INSS? true/false");
        SalarioFamilia salarioFamilia = new SalarioFamilia();
        boolean recebeInss  = leitura.nextBoolean();
        double valorSarioFamlia = salarioFamilia.inseridoInss(recebeInss);

        SalarioMaternidade salarioMaternidade = new SalarioMaternidade();
        double valorSalariomaternidade = salarioMaternidade.calcularSalarioMaternidade(salario, sexo);

        ValeAlimentacao valeAlimentacao = new ValeAlimentacao();
        double valorValeAlimentacao = valeAlimentacao.calcularValeAlimentacao();

        ValeTransporte valeTransporte = new ValeTransporte();
        double valorValeTrasporte = valeTransporte.calcularValeTransporte(salario);

        listaBeneficios.add (new Beneficios(valorAdiantamento, adicionaTempoServico, auxilioCreche, valorInsalubridade, valorTaxaNoturna, valorpericulosidade, valorDsr, valorDiaria, valorHoraExtra, valorSarioFamlia, valorSalariomaternidade, valorValeAlimentacao, valorValeTrasporte));
        return listaBeneficios;
    }
}
