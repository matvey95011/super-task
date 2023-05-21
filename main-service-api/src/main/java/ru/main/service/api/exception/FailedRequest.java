package ru.main.service.api.exception;

public class FailedRequest extends RuntimeException {

    public FailedRequest(String message) {
        super(message);
    }

    public FailedRequest(String message, Throwable cause) {
        super(message, cause);
    }
}
