package desconto;

import java.util.ArrayList;
import java.util.List;
public class Descontos {
    private double faltaAtraso;
    private double fgts;
    private double inss;
    private double irrf;

    public Descontos (double faltaAtraso, double fgts, double inss, double irrf){
        this.faltaAtraso = faltaAtraso;
        this.fgts = fgts;
        this.inss = inss;
        this.irrf = irrf;
    }

    public double getFaltaAtraso() {
        return faltaAtraso;
    }
    public double getFgts() {
        return fgts;
    }
    public double getInss() {
        return inss;
    }
    public double getIrrf() {
        return irrf;
    }

    public static List<Descontos> valoresDescontos() {
        List<Descontos> listaDescontos = new ArrayList<>();

        Falta_atraso falta = new Falta_atraso();
        FGTS fgts = new FGTS();
        INSS inss = new INSS();
        IRRF irrf = new IRRF();

        double faltaAtraso = falta.calculaFaltaAtraso();
        double descontoFgts = fgts.calculaFGTS();
        double valorInss = inss.calcularINSS();
        double valorIrrf = irrf.calculaIRRF();

        listaDescontos.add(new Descontos(faltaAtraso, descontoFgts, valorInss, valorIrrf));

        return listaDescontos;
    }    
}