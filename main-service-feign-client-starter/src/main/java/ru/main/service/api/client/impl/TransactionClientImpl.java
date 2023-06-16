package ru.main.service.api.client.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import ru.main.service.api.client.TransactionClient;
import ru.main.service.api.feign.TransactionFeignClient;
import ru.main.service.api.utils.ResponseUtils;
import ru.main.service.model.PageTransactionResponse;
import ru.main.service.model.TransactionFilterRequest;
import ru.main.service.model.TransactionRequest;
import ru.main.service.model.TransactionResponse;
import ru.main.service.model.TransactionShortResponse;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
public class TransactionClientImpl implements TransactionClient {

    private final TransactionFeignClient client;

    @Override
    public @NotNull TransactionShortResponse create(@NotNull TransactionRequest transactionRequest) {
        log.info("execute addTransaction, TransactionRequest: {}", transactionRequest);
        return ResponseUtils
                .build(client.addTransaction(transactionRequest))
                .status()
                .body();
    }

    @Override
    public @NotNull PageTransactionResponse findAll(@NotNull TransactionFilterRequest filter) {
        log.info("execute findAllTransaction, TransactionFilterRequest: {}", filter);
        return ResponseUtils
                .build(client.findAllTransaction(filter))
                .status()
                .body();
    }

    @Override
    public @NotNull TransactionShortResponse findById(@NotNull UUID id) {
        log.info("execute findByTransactionId, UUID: {}", id);
        return ResponseUtils
                .build(client.findTransactionById(id))
                .status()
                .body();
    }

    @Override
    public @NotNull TransactionResponse findByIdForAdmin(@NotNull UUID id) {
        log.info("execute findByTransactionIdForAdmin, UUID: {}", id);
        return ResponseUtils
                .build(client.findTransactionByIdForAdmin(id))
                .status()
                .body();
    }
}
