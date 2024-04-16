package org.example.beneficios;

public class Adiantamento {
    private double valor;

    // Método para calcular o adiantamento com base no salário e na condição de adiantamento
    public double calcularValorAdiantamento(boolean adiantamento, double salario) {
        if (adiantamento) {
            valor = salario * 0.4;
        } else {
            valor = 0.0;
        }
        return valor;
    }
}
