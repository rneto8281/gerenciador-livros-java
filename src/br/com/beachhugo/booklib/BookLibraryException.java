package src.br.com.beachhugo.booklib;

// Criamos nossa própria exceção herdando de RuntimeException
public class BookLibraryException extends RuntimeException {
    
    // Construtor que recebe a mensagem de erro e repassa para a classe pai (RuntimeException)
    public BookLibraryException(String message) {
        super(message);
    }
}