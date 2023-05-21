package ru.main.service.api.client;

import org.jetbrains.annotations.NotNull;
import ru.main.service.model.PageTransactionResponse;
import ru.main.service.model.TransactionFilterRequest;
import ru.main.service.model.TransactionRequest;
import ru.main.service.model.TransactionResponse;
import ru.main.service.model.TransactionShortResponse;

import java.util.UUID;

public interface TransactionClient {

    /**
     * Create Transaction
     *
     * @param transactionRequest (optional)
     * @return CREATED (status code 201)
     */
    @NotNull TransactionShortResponse create(@NotNull TransactionRequest transactionRequest);


    /**
     * GET /api/v1/transaction
     *
     * @param filter (optional)
     * @return OK (status code 200)
     */
    @NotNull PageTransactionResponse findAll(@NotNull TransactionFilterRequest filter);


    /**
     * GET /api/v1/transaction/{id}
     *
     * @param id (required)
     * @return OK (status code 200)
     */
    @NotNull TransactionShortResponse findById(@NotNull UUID id);


    /**
     * GET /api/v1/transaction/{id}/admin
     *
     * @param id (required)
     * @return OK (status code 200)
     */
    @NotNull TransactionResponse findByIdForAdmin(@NotNull UUID id);

}
