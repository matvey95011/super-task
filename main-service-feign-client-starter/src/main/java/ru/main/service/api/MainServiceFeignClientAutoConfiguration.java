package ru.main.service.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.main.service.api.client.AccountClient;
import ru.main.service.api.client.TransactionClient;
import ru.main.service.api.client.UserClient;
import ru.main.service.api.client.impl.AccountClientImpl;
import ru.main.service.api.client.impl.TransactionClientImpl;
import ru.main.service.api.client.impl.UserClientImpl;
import ru.main.service.api.feign.AccountFeignClient;
import ru.main.service.api.feign.TransactionFeignClient;
import ru.main.service.api.feign.UserFeignClient;

@Configuration
//@ComponentScan(value = "ru.main.service")
@EnableFeignClients(clients = {
        AccountFeignClient.class, TransactionFeignClient.class, UserFeignClient.class
})
public class MainServiceFeignClientAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public AccountClient accountClient(AccountFeignClient client) {
        return new AccountClientImpl(client);
    }

    @Bean
    @ConditionalOnMissingBean
    public TransactionClient transactionClient(TransactionFeignClient client) {
        return new TransactionClientImpl(client);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserClient userClient(UserFeignClient client) {
        return new UserClientImpl(client);
    }

}
