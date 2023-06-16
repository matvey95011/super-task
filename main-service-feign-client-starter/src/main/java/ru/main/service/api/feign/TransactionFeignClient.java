package ru.main.service.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.main.service.api.TransactionApi;

@FeignClient(name = "transactionFeignClient", url = "${feign-clients.main-service}")
public interface TransactionFeignClient extends TransactionApi {
}
