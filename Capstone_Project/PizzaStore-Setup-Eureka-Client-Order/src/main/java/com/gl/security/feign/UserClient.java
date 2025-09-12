package com.gl.security.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;

@FeignClient(name = "USER-SERVICE", path = "/user")
public interface UserClient {

    // Fetch user details by username or ID (adjust according to User microservice API)
    @GetMapping("/{id}")
    Map<String, Object> getUserById(@PathVariable("id") Long id);
}
