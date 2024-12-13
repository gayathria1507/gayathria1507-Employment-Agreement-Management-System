package exception;

public class InvalidEmploymentAgreementException extends RuntimeException {

    public InvalidEmploymentAgreementException(String message) {
        super(message);
    }

    public InvalidEmploymentAgreementException(String message, Throwable cause) {
        super(message, cause);
    }
}
