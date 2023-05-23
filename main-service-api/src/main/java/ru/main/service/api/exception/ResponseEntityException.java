package ru.main.service.api.exception;

public class ResponseEntityException extends RuntimeException {
    public ResponseEntityException(String message) {
        super(message);
    }
}
