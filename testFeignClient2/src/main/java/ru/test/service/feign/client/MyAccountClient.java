package ru.test.service.feign.client;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import ru.main.service.api.client.AccountClient;
import ru.main.service.model.AccountResponse;
import ru.main.service.model.CreateAccountRequest;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageAccountResponse;
import ru.main.service.model.UpdateAccountRequest;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MyAccountClient implements AccountClient {

    @Override
    public @NotNull AccountResponse create(@NotNull CreateAccountRequest createAccountRequest) {
        return null;
    }

    @Override
    public void delete(@NotNull UUID id) {

    }

    @Override
    public @NotNull PageAccountResponse findAll(@NotNull FilterRequest filter) {
        return null;
    }

    @Override
    public @NotNull AccountResponse findById(@NotNull UUID id) {
        return null;
    }

    @Override
    public @NotNull AccountResponse update(@NotNull UUID id, @NotNull UpdateAccountRequest updateAccountRequest) {
        return null;
    }
}
