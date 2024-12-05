package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de Estoque!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Buscar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Mostrar Total de Produtos");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    try {
                        estoque.adicionarProduto(new Produto(nome, quantidade));
                        System.out.println("Produto adicionado com sucesso!");
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Nome do produto a buscar: ");
                    String busca = scanner.nextLine();
                    var produtoBuscado = estoque.buscarProduto(busca);
                    if (produtoBuscado.isPresent()) {
                        System.out.println("Produto encontrado: " + produtoBuscado.get());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();
                    try {
                        estoque.removerProduto(nomeRemover);
                        System.out.println("Produto removido com sucesso!");
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Total de produtos no estoque: " + estoque.totalProdutos());
                    break;

                case 5:
                    System.out.println("Saindo do sistema. Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
