package beneficios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import App.Funcionario;

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
    
    public static List<Beneficios> valoresBeneficios() {
        List<Beneficios> listaBeneficios = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
        Funcionario listaFuncionario = Funcionario.dadosFuncionario().get(0); 
        
        double salario = listaFuncionario.getSalarioBruto();
        String sexo = listaFuncionario.getSexo();

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
        Adicional_tempo_servico  adicionalServico = new Adicional_tempo_servico();
        double adicionaTempoServico = adicionalServico.AdcionalTempo(recebeAdicional);

        AuxilioCreche creche = new AuxilioCreche();
        double auxilioCreche = creche.calcularAuxilioCreche();

        System.out.println("Você recebe adicional de tempo de serviço? true/false");
        Beneficio_insalubridade insalubridade = new Beneficio_insalubridade();
        boolean recebeInsalubridade = leitura.nextBoolean();
        double valorInsalubridade = insalubridade.BeneficioInsalubridade(recebeInsalubridade,salario);

        System.out.println("Você recebe adicional de horario noturno?true/false");
        Beneficio_noturno bonusNoturno = new Beneficio_noturno();
        boolean recebeTaxaNoturna = leitura.nextBoolean();
        double valorTaxaNoturna = bonusNoturno.BeneficioNoturno(recebeTaxaNoturna,salario);

        
        System.out.println("Você recebe o valor de periculosidade? true/false");
        Beneficio_periculosidade periculosidade = new Beneficio_periculosidade();
        boolean recebePericulosidade = leitura.nextBoolean();
        double valorpericulosidade = periculosidade.BeneficioPerciulosidade(recebePericulosidade,salario);

        System.out.println("Você cumpriu a sua jornada mensal? true/false");
        Descanso_remunerado dsr = new Descanso_remunerado();
        boolean recebeDsr = leitura.nextBoolean();
        double valorDsr = dsr.calcularRepousoSemanal(recebeDsr,salario);

        System.out.println("quantos dias ficou de viagem?");
        Diaria_viagem diariaViagem = new Diaria_viagem();
        int diasDeViagem = leitura.nextInt();
        double valorDiaria = diariaViagem.calcularValorDiarias(diasDeViagem);

        Hora_extra horaExtra = new Hora_extra();
        double valorHoraExtra = horaExtra.calcularHoraExtra(salario);

        System.out.println("recebe INSS? true/false");
        SalarioFamilia salarioFamilia = new SalarioFamilia();
        boolean recebeInss  = leitura.nextBoolean();
        double valorSarioFamlia = salarioFamilia.inseridoInss(recebeInss);

        System.out.println("Que dia saiu de afastamento de maternidade?");
        SalarioMaternidade salarioMaternidade = new SalarioMaternidade();
        String afastamentoMaternidade  = leitura.nextLine();
        double valorSalariomaternidade = salarioMaternidade.calcularSalarioMaternidade(salario, afastamentoMaternidade, sexo);

        Vale_Alimentacao valeAlimentacao = new Vale_Alimentacao();
        double valorValeAlimentacao = valeAlimentacao.calcularValeAlimentacao();

        Vale_transporte valeTransporte = new Vale_transporte();
        double valorValeTrasporte = valeTransporte.calcularValeTransporte(salario);

        listaBeneficios.add (new Beneficios(valorAdiantamento, adicionaTempoServico, auxilioCreche, valorInsalubridade, valorTaxaNoturna, valorpericulosidade, valorDsr, valorDiaria, valorHoraExtra, valorSarioFamlia, valorSalariomaternidade, valorValeAlimentacao, valorValeTrasporte));
        return listaBeneficios;
    }
}
