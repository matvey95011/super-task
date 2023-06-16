package ru.main.service.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.main.service.api.AccountApi;
import ru.main.service.model.AccountResponse;
import ru.main.service.model.CreateAccountRequest;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageAccountResponse;
import ru.main.service.model.UpdateAccountRequest;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountController implements AccountApi {
    @Override
    public ResponseEntity<AccountResponse> createAccount(CreateAccountRequest createAccountRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteAccount(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<AccountResponse> findAccountById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<PageAccountResponse> findAllAccount(FilterRequest filter) {
        return null;
    }

    @Override
    public ResponseEntity<AccountResponse> updateAccount(UUID id, UpdateAccountRequest updateAccountRequest) {
        return null;
    }
}
