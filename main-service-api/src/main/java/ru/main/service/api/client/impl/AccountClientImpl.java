package ru.main.service.api.client.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import ru.main.service.api.client.AccountClient;
import ru.main.service.api.feign.AccountFeignClient;
import ru.main.service.api.utils.ResponseUtils;
import ru.main.service.model.AccountResponse;
import ru.main.service.model.CreateAccountRequest;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageAccountResponse;
import ru.main.service.model.UpdateAccountRequest;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountClientImpl implements AccountClient {

    private final AccountFeignClient client;

    @Override
    public @NotNull AccountResponse create(@NotNull CreateAccountRequest createAccountRequest) {
        log.info("execute createAccount, CreateAccountRequest: {}", createAccountRequest);
        return ResponseUtils
                .build(client.createAccount(createAccountRequest))
                .status()
                .body();
    }

    @Override
    public void delete(@NotNull UUID id) {
        log.info("execute deleteAccount, UUID: {}", id);
        ResponseUtils.build(client.deleteAccount(id)).status();
    }

    @Override
    public @NotNull PageAccountResponse findAll(@NotNull FilterRequest filter) {
        log.info("execute findAllAccount, FilterRequest: {}", filter);
        return ResponseUtils
                .build(client.findAllAccount(filter))
                .status()
                .body();
    }

    @Override
    public @NotNull AccountResponse findById(@NotNull UUID id) {
        log.info("execute findByAccountId, UUID: {}", id);
        return ResponseUtils
                .build(client.findAccountById(id))
                .status()
                .body();
    }

    @Override
    public @NotNull AccountResponse update(@NotNull UUID id, @NotNull UpdateAccountRequest updateAccountRequest) {
        log.info("execute updateAccount, UUID: {}, UpdateAccountRequest: {}", id, updateAccountRequest);
        return ResponseUtils
                .build(client.updateAccount(id, updateAccountRequest))
                .status()
                .body();
    }


}
