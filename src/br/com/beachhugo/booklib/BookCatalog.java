package src.br.com.beachhugo.booklib;

// Importações necessárias para listas, ordenação e filtros
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BookCatalog {
    
    // Lista onde guardamos os livros na memória
    private List<Book> books;

    // Construtor: inicializa a lista vazia
    public BookCatalog() {
        this.books = new ArrayList<>();
    }

    // Método para cadastrar um livro com validações de segurança
    public void registerBook(Book book) {
        if (book == null) {
            throw new BookLibraryException("Não é possível registrar um livro nulo (null).");
        }
        
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            throw new BookLibraryException("O título do livro é obrigatório e não pode estar vazio.");
        }

        if (book.getPopularityLevel() < 1 || book.getPopularityLevel() > 5) {
            throw new BookLibraryException("O nível de popularidade do livro deve ser um número inteiro entre 1 e 5.");
        }

        // Se passar por todas as validações, adiciona à lista
        this.books.add(book);
    }

    // Retorna os livros em ordem alfabética (A-Z) pelo título
    public List<Book> getBooksOrderedAlphabetically() {
        List<Book> sortedList = new ArrayList<>(this.books); // Cópia defensiva para não bagunçar a lista original
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
        return sortedList;
    }

    // Busca livros de um autor específico (ignora maiúsculas/minúsculas)
    public List<Book> findBooksByAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            return Collections.emptyList();
        }
        return this.books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName.trim()))
                .collect(Collectors.toList());
    }

    // Retorna os livros do mais recente para o mais antigo (data decrescente)
    public List<Book> getBooksOrderedByPublicationDate() {
        List<Book> sortedList = new ArrayList<>(this.books);
        sortedList.sort(Comparator.comparing(Book::getPublicationDate).reversed());
        return sortedList;
    }

    // Retorna os livros ordenados por popularidade (do de 5 estrelas até o de 1)
    public List<Book> getBooksByPopularity() {
        List<Book> sortedList = new ArrayList<>(this.books);
        sortedList.sort(Comparator.comparingInt(Book::getPopularityLevel).reversed());
        return sortedList;
    }

    // Retorna todos os livros cadastrados
    public List<Book> getAllBooks() {
        return new ArrayList<>(this.books);
    }
}