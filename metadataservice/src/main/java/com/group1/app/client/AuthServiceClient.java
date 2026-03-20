package com.group1.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "csfc-auth-service", url = "${auth.service.url}")
public interface AuthServiceClient {


    @PostMapping("/api/report-service/debug/public/feign")
    String registerServicePermissions(@RequestBody ServiceRbpRequest request);

}
