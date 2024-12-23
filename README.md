### **Instruções para Implementação de Testes Unitários**

Implemente testes unitários em um projeto Java para validar o funcionamento das classes **Estoque** e **Produto** (classes fornecidas neste exercício), conforme orientação a seguir:

1. **Implemente a classe de teste `EstoqueTest` utilizando JUnit**:
   - Na `EstoqueTest`, escreva testes para cobrir cenários como:
     - Adição de produtos duplicados.
     - Busca de produtos não existentes.
     - Outros cenários que julgar relevantes.

2. **Implemente a classe de teste `ProdutoTest` utilizando JUnit**:
   - Na `ProdutoTest`, escreva testes para cobrir os mais diversos cenários, como validação de atributos e comportamento esperado dos métodos.

---

### **Dicas**

1. Adicione a dependência do JUnit no projeto para habilitar o framework de testes:

   ```xml
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter</artifactId>
       <version>5.11.2</version>
       <scope>test</scope>
   </dependency>
   ```

2. Execute o projeto de teste que disponibilizei no GitHub (vejam o link no módulo "Testes unitários").

---

### **Links úteis**

- [Exemplo de projeto de testes no GitHub](https://github.com/idp-edu/poo_2024-2/tree/main/2.junit/contabancaria_test)
- [Tutorial básico JUnit - DevMedia](https://www.devmedia.com.br/junit-tutorial/1432)
- [Testes unitários com JUnit - DevMedia](https://www.devmedia.com.br/teste-unitario-com-junit/41235)
- [Baeldung - JUnit 5](https://www.baeldung.com/junit-5)
- [Testes unitários em Java - FreeCodeCamp](https://www.freecodecamp.org/portuguese/news/como-escrever-testes-unitarios-em-java/)
- [Testes de unidade com JUnit - CodeGym](https://codegym.cc/pt/groups/posts/pt.191.teste-de-unidade-em-java-com-junit)

---

### **Observação**

- O **trabalho é individual**.
- A entrega deve ser realizada pelo GitHub, cujo **link** deve ser informado nesta tarefa.

---

---

### **Explicação do Código Implementado**

#### **O que foi feito?**

O projeto foi configurado para realizar **testes unitários** em duas classes principais:
- **Produto**: Representa um item do estoque com nome e quantidade.
- **Estoque**: Gerencia os produtos armazenados.

Foram implementadas duas classes de teste:
1. **`ProdutoTest`**: Valida a criação e manipulação de objetos `Produto`.
   - Testes incluem a verificação de:
     - Atributos (`nome`, `quantidade`).
     - Modificação de valores.
     - Representação do objeto com `toString`.

2. **`EstoqueTest`**: Garante que a lógica de gerenciamento de produtos funcione corretamente.
   - Cobre cenários como:
     - Adicionar produtos.
     - Evitar duplicatas.
     - Buscar e remover produtos.
     - Validar o total de itens no estoque.

#### **Como foi feito?**

1. **Configuração do Maven**:
   - Utilizamos o Maven para gerenciar as dependências do projeto.
   - O JUnit foi configurado como framework de testes.

2. **Escrita dos Testes**:
   - Utilizamos **JUnit 5** para garantir o funcionamento correto de métodos das classes.
   - Cenários com diferentes entradas e validações foram cobertos.

3. **Execução**:
   - Os testes foram executados no terminal do IntelliJ e via Maven usando o comando `mvn test`.

Esses testes garantem que alterações futuras no código possam ser verificadas automaticamente para manter a estabilidade do projeto.
