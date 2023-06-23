package S15.exercicio.conta.model.exception;

public class WithdrawalAmountLimitException extends RuntimeException{

    public WithdrawalAmountLimitException() {
    }

    public WithdrawalAmountLimitException(String message) {
        super(message);
    }
}
