package org.example.App;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


    public class FuncionarioTest {

        @Test
        public void testDadosFuncionario() {
            List<Funcionario> listaFuncionarios = Funcionario.dadosFuncionario();
            assertEquals(3, listaFuncionarios.size()); // Verifica se há três funcionários cadastrados
            // Adicione mais verificações conforme necessário para garantir que os dados dos funcionários estejam corretos
        }
    }
