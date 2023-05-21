package ru.main.service.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.main.service.api.AccountApi;

@FeignClient(name = "accountFeignClient", url = "${feign-clients.main-service}")
public interface AccountFeignClient extends AccountApi {
}
