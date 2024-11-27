package com.example;

import org.example.Estoque;
import org.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {

    @Test
    void testAdicionarProduto() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Produto1", 10);

        estoque.adicionarProduto(produto);
        assertTrue(estoque.buscarProduto("Produto1").isPresent(), "Produto1 deveria estar presente no estoque após ser adicionado");
    }

    @Test
    void testAdicionarProdutoDuplicado() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Produto1", 10);

        estoque.adicionarProduto(produto);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> estoque.adicionarProduto(produto));
        assertEquals("Produto já existe no estoque.", exception.getMessage(), "Deveria lançar exceção para produtos duplicados");
    }

    @Test
    void testBuscarProdutoInexistente() {
        Estoque estoque = new Estoque();
        assertFalse(estoque.buscarProduto("ProdutoInexistente").isPresent(), "Produto inexistente não deveria ser encontrado no estoque");
    }

    @Test
    void testRemoverProduto() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Produto1", 10);
        estoque.adicionarProduto(produto);

        estoque.removerProduto("Produto1");
        assertFalse(estoque.buscarProduto("Produto1").isPresent(), "Produto1 deveria ser removido do estoque");
    }

    @Test
    void testRemoverProdutoInexistente() {
        Estoque estoque = new Estoque();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> estoque.removerProduto("ProdutoInexistente"));
        assertEquals("Produto não encontrado no estoque.", exception.getMessage(), "Deveria lançar exceção ao tentar remover um produto inexistente");
    }

    @Test
    void testTotalProdutos() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto("Produto1", 10));
        estoque.adicionarProduto(new Produto("Produto2", 5));

        assertEquals(2, estoque.totalProdutos(), "O total de produtos no estoque deveria ser 2");
    }
}

