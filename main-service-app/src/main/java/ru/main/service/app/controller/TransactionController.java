package ru.main.service.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.main.service.api.TransactionApi;
import ru.main.service.model.PageTransactionResponse;
import ru.main.service.model.TransactionFilterRequest;
import ru.main.service.model.TransactionRequest;
import ru.main.service.model.TransactionResponse;
import ru.main.service.model.TransactionShortResponse;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TransactionController implements TransactionApi {
    @Override
    public ResponseEntity<TransactionShortResponse> addTransaction(TransactionRequest transactionRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PageTransactionResponse> findAllTransaction(TransactionFilterRequest filter) {
        return null;
    }

    @Override
    public ResponseEntity<TransactionShortResponse> findTransactionById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<TransactionResponse> findTransactionByIdForAdmin(UUID id) {
        return null;
    }
}
