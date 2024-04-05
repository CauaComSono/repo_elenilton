package beneficios;

public class Adiantamento {
    private double valor;

    // Método para calcular o adiantamento com base no salário e na condição de adiantamento
    public double calcularValorAdiantamento(boolean adiantamento, double salario) {
        if (adiantamento) {
            valor = calcularAdiantamento(salario);
        } else {
            valor = 0.0;
        }
        return valor;
    }

    // Método para calcular o adiantamento como 40% do salário
    private double calcularAdiantamento(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser positivo e diferente de zero.");
        }
        return salario * 0.4;
    }
}
