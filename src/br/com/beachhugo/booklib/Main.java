package src.br.com.beachhugo.booklib;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do nosso catálogo
        BookCatalog catalog = new BookCatalog();

        try {
            // Cadastrando livros de exemplo com diferentes autores, datas e popularidades
            catalog.registerBook(new Book("O Alquimista", "Paulo Coelho", LocalDate.of(1988, 5, 1), 5));
            catalog.registerBook(new Book("Dom Casmurro", "Machado de Assis", LocalDate.of(1899, 1, 1), 4));
            catalog.registerBook(new Book("A Hora da Estrela", "Clarice Lispector", LocalDate.of(1977, 10, 26), 5));
            catalog.registerBook(new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis", LocalDate.of(1881, 1, 1), 3));

            System.out.println("--- 1. CONSULTA EM ORDEM ALFABÉTICA (A-Z) ---");
            List<Book> az = catalog.getBooksOrderedAlphabetically();
            for (Book b : az) {
                System.out.println(b);
            }

            System.out.println("\n--- 2. CONSULTA POR DATA (MAIS RECENTES PRIMEIRO) ---");
            List<Book> porData = catalog.getBooksOrderedByPublicationDate();
            for (Book b : porData) {
                System.out.println(b);
            }

            System.out.println("\n--- 3. CONSULTA POR POPULARIDADE (DO MAIOR PARA O MENOR) ---");
            List<Book> porPopularidade = catalog.getBooksByPopularity();
            for (Book b : porPopularidade) {
                System.out.println(b);
            }

            System.out.println("\n--- 4. BUSCA POR AUTOR: Machado de Assis ---");
            List<Book> machado = catalog.findBooksByAuthor("Machado de Assis");
            for (Book b : machado) {
                System.out.println(b);
            }

            System.out.println("\n--- 5. TESTANDO VALIDAÇÃO DE ERRO (FORÇANDO ERRO) ---");
            // Isso vai forçar um erro de validação porque a popularidade máxima permitida é 5
            catalog.registerBook(new Book("Livro Inválido", "Ninguém", LocalDate.now(), 10));

        } catch (BookLibraryException e) {
            // Se nossa validação barrar o livro acima, caímos aqui de forma limpa e segura!
            System.err.println("Capturado erro esperado da biblioteca: " + e.getMessage());
        }
    }
}