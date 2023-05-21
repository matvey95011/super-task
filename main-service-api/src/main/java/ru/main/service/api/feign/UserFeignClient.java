package ru.main.service.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.main.service.api.UserApi;

@FeignClient(name = "userFeignClient", url = "${feign-clients.main-service}")
public interface UserFeignClient extends UserApi {
}
