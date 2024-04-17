package org.example.App;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


    public class FuncionarioTest {

        @Test
        public void testDadosFuncionario() {
            List<Funcionario> listaFuncionarios = Funcionario.dadosFuncionario();
            assertEquals(3, listaFuncionarios.size()); // Verifica se há três funcionários cadastrados
            assertEquals("Maria Santos", listaFuncionarios.get(0).getNomeCompleto());
            assertEquals("João da Silva", listaFuncionarios.get(1).getNomeCompleto());
            assertEquals("Carlos Roberto", listaFuncionarios.get(2).getNomeCompleto());
        }
    }
