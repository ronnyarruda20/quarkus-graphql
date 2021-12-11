package org.graphql;

import io.quarkus.test.junit.QuarkusTest;
import org.graphql.modules.service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
public class UsuarioResourceTeste {

    @Inject
    UsuarioService usuarioService;


    @Test
    public void testConsultaMedicamentoSize() {
        var listaMedicamentos = usuarioService.consultaMedicamento();
        System.out.println("Lista de Medicamento: "+ listaMedicamentos.toString());
        Assertions.assertEquals(1, listaMedicamentos.size());
    }
}
