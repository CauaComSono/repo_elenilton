/*Todo trabalhador tem direito a um dia de descanso remunerado, ou seja, pago. A legislação estabelece que essa folga ocorra,
preferencialmente, aos domingos, mas isso não é obrigatório.
O repouso semanal deve ser de 24 horas, sem possibilidade de divisão desse tempo em horas diárias. Por outro lado, o colaborador que não cumprir
 sua jornada de trabalho, integralmente, poderá perder esse descanso.
*/
package beneficios;
public class Descanso_remunerado {

    private double salario;
    private boolean cumpriuJornada;

    // Construtor e outros métodos da classe

    // Método para calcular o valor do repouso semanal remunerado
    public double calcularRepousoSemanal() {
        // Suponhamos que o repouso seja de 24 horas consecutivas
        // e o salário seja mensal
        if (cumpriuJornada) {
            return salario / 30; // Valor diário do salário
        } else {
            return 0; // Não há repouso se não cumprir a jornadaaaaaa
        }
    }}
