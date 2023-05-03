package com.example.deliveryservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("memberservice")
public interface MemberServiceFeignClient {
    @GetMapping(value = "/member/{id}",consumes = "application/json")
    Member  getMemberId(@PathVariable("id") Long id);
}
