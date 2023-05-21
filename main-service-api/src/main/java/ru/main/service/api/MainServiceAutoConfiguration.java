package ru.main.service.api;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.main.service.api.feign.AccountFeignClient;
import ru.main.service.api.feign.TransactionFeignClient;
import ru.main.service.api.feign.UserFeignClient;

@Configuration
@ComponentScan(value = "ru.main.service")
@EnableFeignClients(clients = {
        AccountFeignClient.class, TransactionFeignClient.class, UserFeignClient.class
})
public class MainServiceAutoConfiguration {
}

