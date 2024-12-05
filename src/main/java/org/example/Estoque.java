package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Estoque {
    private Map<String, Produto> produtos = new HashMap<>();

    public void adicionarProduto(Produto produto) {
        if (produtos.containsKey(produto.getNome())) {
            throw new RuntimeException("Produto já existe no estoque.");
        }
        produtos.put(produto.getNome(), produto);
    }

    public Optional<Produto> buscarProduto(String nome) {
        return Optional.ofNullable(produtos.get(nome));
    }

    public void removerProduto(String nome) {
        if (!produtos.containsKey(nome)) {
            throw new RuntimeException("Produto não encontrado no estoque.");
        }
        produtos.remove(nome);
    }

    public int totalProdutos() {
        return produtos.size();
    }
}
