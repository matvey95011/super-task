package ru.main.service.api.client;

import org.jetbrains.annotations.NotNull;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageUserResponse;
import ru.main.service.model.UserRequest;
import ru.main.service.model.UserResponse;

import java.util.UUID;

public interface UserClient {

    /**
     * Создание пользователя
     *
     * @param userRequest  (optional)
     * @return CREATED (status code 201)
     */
    @NotNull UserResponse create(@NotNull UserRequest userRequest);


    /**
     * Удаление пользователя
     *
     * @param id  (required)
     */
    void delete(@NotNull UUID id);


    /**
     * Получение списка пользователей по фильтру
     *
     * @param filter  (optional)
     * @return PageUserResponse
     */
    @NotNull PageUserResponse findAll(@NotNull FilterRequest filter);


    /**
     * Получение пользователя по id
     *
     * @param id  (required)
     * @return UserResponse
     */
    @NotNull UserResponse findById(@NotNull UUID id);

}
