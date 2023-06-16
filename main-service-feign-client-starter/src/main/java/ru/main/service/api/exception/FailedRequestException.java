package ru.main.service.api.exception;

public class FailedRequestException extends RuntimeException {

    public FailedRequestException(String message) {
        super(message);
    }

    public FailedRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
