package ru.main.service.api.client;


import org.jetbrains.annotations.NotNull;
import ru.main.service.model.AccountResponse;
import ru.main.service.model.CreateAccountRequest;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageAccountResponse;
import ru.main.service.model.UpdateAccountRequest;

import java.util.UUID;

public interface AccountClient {

    /**
     * Создание аккаунта
     *
     * @param createAccountRequest (optional)
     * @return AccountResponse
     */
    @NotNull AccountResponse create(@NotNull CreateAccountRequest createAccountRequest);


    /**
     * Удаление аккаунта
     *
     * @param id (required)
     */
    void delete(@NotNull UUID id);


    /**
     * Получение списка аккаунтов по фильтру
     *
     * @param filter (optional)
     * @return PageAccountResponse
     */
    @NotNull PageAccountResponse findAll(@NotNull FilterRequest filter);


    /**
     * Получение аккаунта по id
     *
     * @param id (required)
     * @return AccountResponse
     */
    @NotNull AccountResponse findById(@NotNull UUID id);


    /**
     * Обновление аккаунта
     *
     * @param id                   (required)
     * @param updateAccountRequest (optional)
     * @return AccountResponse
     */
    @NotNull AccountResponse update(@NotNull UUID id, @NotNull UpdateAccountRequest updateAccountRequest);


}
