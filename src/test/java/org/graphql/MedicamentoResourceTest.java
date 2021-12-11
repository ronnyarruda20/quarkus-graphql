package org.graphql;

import io.quarkus.test.junit.QuarkusTest;
import org.graphql.modules.dto.EstoqueDTO;
import org.graphql.modules.dto.MedicamentoDTO;
import org.graphql.modules.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class MedicamentoResourceTest {

    private static MedicamentoDTO dto = new MedicamentoDTO();

    @Inject
    MedicamentoService usuarioService;

    @BeforeAll
    public static void setup() {
        EstoqueDTO estoqueDTO = new EstoqueDTO();
        estoqueDTO.setQuantidade(243);
        dto.setNome("Anador");
        dto.setBula("https://www.bulario.com/anador/");
        dto.setQuantidade(24);
        dto.setReceitaUsuario(null);
        dto.setEstoque(estoqueDTO);
    }


    @Test
    public void testConsultaMedicamentoSave() {
       String response = this.usuarioService.save(dto);
        Assertions.assertEquals("Salvo Com Sucesso", response);
    }

    @Test
    public void testConsultaMedicamentoList() {
        var listaMedicamentos = this.usuarioService.listaAll();
        System.out.println(listaMedicamentos);
    }
}
