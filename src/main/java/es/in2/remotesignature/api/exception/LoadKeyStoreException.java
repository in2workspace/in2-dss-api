package es.in2.remotesignature.api.exception;

public class LoadKeyStoreException extends RuntimeException {
    public static final String DEFAULT_EXCEPTION_MESSAGE = "Error loading keystore";

    public LoadKeyStoreException(Exception e) {
        super(DEFAULT_EXCEPTION_MESSAGE, e);
    }

    public LoadKeyStoreException(String message, Exception e) {
        super(message, e);
    }

}
