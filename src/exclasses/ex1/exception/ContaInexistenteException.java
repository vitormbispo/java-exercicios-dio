package exclasses.ex1.exception;

public class ContaInexistenteException extends RuntimeException{
    public ContaInexistenteException(String message) {
        super(message);
    }
}
