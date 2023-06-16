package ru.main.service.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.main.service.api.UserApi;
import ru.main.service.model.FilterRequest;
import ru.main.service.model.PageUserResponse;
import ru.main.service.model.UserRequest;
import ru.main.service.model.UserResponse;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {
    @Override
    public ResponseEntity<UserResponse> addUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<PageUserResponse> findAllUser(FilterRequest filter) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> findUserById(UUID id) {
        return null;
    }
}
