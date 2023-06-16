package ru.test.service.feign.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.main.service.api.client.AccountClient;
import ru.main.service.api.feign.AccountFeignClient;
import ru.main.service.model.AccountResponse;
import ru.main.service.model.CreateAccountRequest;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestClient {

    private final AccountClient accountClient;
//    private final AccountFeignClient client;
//    private final TestFeignClient testFeignClient;

    public void test() {
        AccountResponse accountResponse = accountClient.create(new CreateAccountRequest());
    }


}
