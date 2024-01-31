package S15.exercicio.conta.model.exception;

public class ValueNullException extends RuntimeException{

    public ValueNullException() {
    }

    public ValueNullException(String message) {
        super(message);
    }
}
