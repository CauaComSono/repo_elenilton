package App;

import java.util.Date;

public class FolhaDePagamento {

    static Date data;
    static Double valorLiquido;
    static Double valorBruto;
    static Double auxSalarioLiquido;
    
    public static Double getAuxSalarioLiquido() {
        return auxSalarioLiquido;
    }
    public static void setAuxSalarioLiquido(Double auxSalarioLiquido) {
        FolhaDePagamento.auxSalarioLiquido = auxSalarioLiquido;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        FolhaDePagamento.data = data;
    }
    public Double getValorLiquido() {
        return valorLiquido;
    }
    public void setValorLiquido(Double valorLiquido) {
        FolhaDePagamento.valorLiquido = valorLiquido;
    }
    public static Double getValorBruto() {
        return valorBruto;
    }
    public void setValorBruto(Double valorBruto) {
        FolhaDePagamento.valorBruto = valorBruto;
    }

}