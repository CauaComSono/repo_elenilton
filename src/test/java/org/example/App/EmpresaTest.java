package org.example.App;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    public void testDadosEmpregador() {
        // Aqui podemos testar se o método dadosEmpregador() retorna uma lista não nula e se contém os itens esperados
        List<Empresa> empresas = Empresa.dadosEmpregador();

        assertNotNull(empresas);
        assertFalse(((List<?>) empresas).isEmpty());

        // Vamos verificar se a lista contém pelo menos uma das empresas esperadas
        boolean empresaEncontrada = false;
        for (Empresa empresa : empresas) {
            if (empresa.getRazaoSocial().equals("Sorveteria Gelado no Frio")) {
                empresaEncontrada = true;
                break;
            }
        }
        assertTrue(empresaEncontrada);
    }

}