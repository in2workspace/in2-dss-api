package es.in2.remotesignature.vault.exception;

public class VaultFactoryException extends RuntimeException {
    private static final String MESSAGE = "Invalid number of vault services. Number found: ";
    public VaultFactoryException(int size) {
        super(MESSAGE + size);
    }
}
