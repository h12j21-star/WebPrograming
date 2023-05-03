package gcu.backend.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("memberservice")
public interface MemberServiceFeignClient {

    @GetMapping(value = "/member/{id}",
            consumes = "application/json")
    Member  getMemberId(@PathVariable("id") Long id);
}
