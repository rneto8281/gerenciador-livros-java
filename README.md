# 📚 Gerenciador de Catálogo de Livros

Uma biblioteca Java moderna, leve e robusta criada do zero para registrar e consultar livros com filtros inteligentes e ordenações avançadas.

---

## ✨ Funcionalidades

* 📝 **Registro Seguro:** Validações rigorosas de dados para evitar inserções inválidas (como livros sem título ou notas de popularidade fora do limite).
* 🔤 **Ordenação Alfabética (A-Z):** Retorna os livros catalogados organizados pelo título.
* 📈 **Consulta por Popularidade:** Lista as obras do maior nível de relevância (5 estrelas) até o menor.
* 📅 **Histórico de Publicação:** Ordena as obras das mais recentes para as mais antigas.
* 🔍 **Filtro de Autor:** Pesquisa livros de autores específicos sem se preocupar com letras maiúsculas ou minúsculas.

---

## 🛠️ Estrutura do Projeto

O projeto foi estruturado seguindo as melhores práticas de orientação a objetos e divisão de pacotes Java:

* `Book.java`: Classe de modelo que define os atributos do livro.
* `BookCatalog.java`: Classe de serviço responsável pelas lógicas de busca, ordenação e regras de negócios.
* `BookLibraryException.java`: Exceção customizada da biblioteca para tratamento de erros limpo.
* `Main.java`: Classe executável para testes rápidos no console.

---

## ⚙️ Como Executar

### Pré-requisitos
* Java JDK 8 ou superior instalado.
* VS Code com a extensão *Extension Pack for Java*.

### Passo a passo
1. Clone este repositório no seu computador.
2. Abra a pasta do projeto no VS Code.
3. Abra o arquivo `Main.java` e clique em **Run** no topo direito.

---

## 📄 Licença

Este projeto está sob a licença [MIT](./LICENSE). Sinta-se livre para usar, modificar e distribuir!