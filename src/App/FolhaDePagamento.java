package App;

import java.util.Date;

public class FolhaDePagamento {

    Date data;
    Double valorLiquido;
    Double valorBruto;
    Double auxSalarioLiquido;
    
    public Double getAuxSalarioLiquido() {
        return auxSalarioLiquido;
    }
    public void setAuxSalarioLiquido(Double auxSalarioLiquido) {
        this.auxSalarioLiquido = auxSalarioLiquido;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Double getValorLiquido() {
        return valorLiquido;
    }
    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }
    public Double getValorBruto() {
        return valorBruto;
    }
    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

}