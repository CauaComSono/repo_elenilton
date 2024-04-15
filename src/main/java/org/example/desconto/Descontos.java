package desconto;

import java.util.ArrayList;
import java.util.List;
public class Descontos {
    private double faltaAtraso;
    private double fgts;
    private double inss;
    private double irrf;
    private double pensaoAlimenticia;

    public Descontos (double faltaAtraso, double fgts, double inss, double irrf, double pensaoAlimenticia){
        this.faltaAtraso = faltaAtraso;
        this.fgts = fgts;
        this.inss = inss;
        this.irrf = irrf;
        this.pensaoAlimenticia = pensaoAlimenticia;
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
    public double getPensaoAlimenticia() {
        return pensaoAlimenticia;
    }

    public static List<Descontos> valoresDescontos() {
        List<Descontos> listaDescontos = new ArrayList<>();

        FaltaAtraso falta = new FaltaAtraso();
        FGTS fgts = new FGTS();
        INSS inss = new INSS();
        IRRF irrf = new IRRF();

        double faltaAtraso = falta.calculaFaltaAtraso();
        double descontoFgts = fgts.calculaFGTS();
        double valorInss = inss.calcularINSS();
        double valorIrrf = irrf.calculaIRRF();
        double pensaoAlimenticia = PensaoAlimenticia.calculaPensaoAlimenticia();

        listaDescontos.add(new Descontos(faltaAtraso, descontoFgts, valorInss, valorIrrf, pensaoAlimenticia));

        return listaDescontos;
    }    
}