package ru.main.service.api.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import ru.main.service.api.exception.EmptyRequestException;
import ru.main.service.api.exception.FailedRequest;

import static java.util.Objects.isNull;

@Slf4j
@RequiredArgsConstructor
public class ResponseUtils<T> {
    private final ResponseEntity<T> response;

    public static <T> ResponseUtils<T> build(ResponseEntity<T> response) {
        return new ResponseUtils<>(response);
    }

    public ResponseUtils<T> status() {
        if (!response.getStatusCode().is2xxSuccessful()) {
            log.error("Response: STATUS-CODE={}, BODY={}", response.getStatusCode(), response.getBody());
            throw new FailedRequest(response.getStatusCode().toString());
        }
        return this;
    }

    public T body() {
        if (isNull(response.getBody()) || !response.hasBody()) {
            log.error("Response from: STATUS-CODE={}, BODY={}", response.getStatusCode(), response.getBody());
            throw new EmptyRequestException(response.getStatusCode().toString());
        }
        return response.getBody();
    }

}
