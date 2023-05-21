package ru.main.service.api.client.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import ru.main.service.api.client.UserClient;
import ru.main.service.api.feign.UserFeignClient;
import ru.main.service.api.utils.ResponseUtils;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageUserResponse;
import ru.main.service.model.UserRequest;
import ru.main.service.model.UserResponse;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserClientImpl implements UserClient {

    private final UserFeignClient client;

    @Override
    public @NotNull UserResponse create(@NotNull UserRequest userRequest) {
        log.info("execute addUser, UserRequest: {}", userRequest);
        return ResponseUtils
                .build(client.addUser(userRequest))
                .status()
                .body();
    }

    @Override
    public void delete(@NotNull UUID id) {
        log.info("execute deleteUser, UUID: {}", id);
        ResponseUtils
                .build(client.deleteUser(id))
                .status();
    }

    @Override
    public @NotNull PageUserResponse findAll(@NotNull FilterRequest filter) {
        log.info("execute findAllUser, FilterRequest: {}", filter);
        return ResponseUtils
                .build(client.findAllUser(filter))
                .status()
                .body();
    }

    @Override
    public @NotNull UserResponse findById(@NotNull UUID id) {
        log.info("execute findByUserId, UUID: {}", id);
        return ResponseUtils
                .build(client.findUserById(id))
                .status()
                .body();
    }
}
