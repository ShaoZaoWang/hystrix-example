package com.example.hystrix.user.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "activity"
/*,fallback = FeignActivityServiceFallBack.class*/
        ,fallbackFactory = FeignActivityServiceFallBackFactory.class)
public interface FeignActivityServiceClient{
    String firstLogin(Long userId);

     String firstLoginTimeout(Long userId);

     String firstLoginError(Long userId);
}
