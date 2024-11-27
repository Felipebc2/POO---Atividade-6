package com.example;

import org.example.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testCriacaoProduto() {
        Produto produto = new Produto("Produto1", 10);

        assertEquals("Produto1", produto.getNome(), "O nome do produto deveria ser 'Produto1'");
        assertEquals(10, produto.getQuantidade(), "A quantidade do produto deveria ser 10");
    }

    @Test
    void testAtualizarQuantidade() {
        Produto produto = new Produto("Produto1", 10);
        produto.setQuantidade(20);

        assertEquals(20, produto.getQuantidade(), "A quantidade do produto deveria ser atualizada para 20");
    }

    @Test
    void testProdutoToString() {
        Produto produto = new Produto("Produto1", 10);

        assertEquals("Produto1 - 10 unidades", produto.toString(), "O método toString deveria retornar 'Produto1 - 10 unidades'");
    }
}
