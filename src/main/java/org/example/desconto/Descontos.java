package org.example.desconto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.App.Funcionario;
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

    public static List<Descontos> valoresDescontos(List<Funcionario> listaFuncionarios) {
        List<Descontos> listaDescontos = new ArrayList<>();
        Funcionario funcionario = listaFuncionarios.get(0);

        double salario = funcionario.getSalarioBruto();

        Scanner scan = new Scanner(System.in);

        FaltaAtraso falta = new FaltaAtraso();
        FGTS fgts = new FGTS();
        INSS inss = new INSS();
        IRRF irrf = new IRRF();
        PensaoAlimenticia pensaoAlimenticia = new PensaoAlimenticia(); 

        double faltaAtraso = falta.calculaFaltaAtraso();
        double descontoFgts = fgts.calculaFGTS();
        double valorInss = inss.calcularINSS();
        double valorIrrf = irrf.calculaIRRF();
        System.out.println("Você paga pensão alimenticia? true/false");
        boolean respostaPensaoAlimenticia = scan.nextBoolean();
        double valorpensaoAlimenticia = pensaoAlimenticia.calculaPensaoAlimenticia(respostaPensaoAlimenticia, salario);

        listaDescontos.add(new Descontos(faltaAtraso, descontoFgts, valorInss, valorIrrf, valorpensaoAlimenticia));

        return listaDescontos;
    }    
}