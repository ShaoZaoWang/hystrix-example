package com.example.hystrix.user.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignActivityServiceFallBack {
    public String firstLogin(Long userId) {
        return null;
    }

    public String firstLoginTimeout(Long userId) {
        return "feign 超时回退";
    }

    public String firstLoginError(Long userId) {
        return null;
    }
}
