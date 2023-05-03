package com.example.deliveryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DeliveryController {

    private final MemberServiceFeignClient memberServiceFeignClient;
    private final ProductServiceFeignClient productServiceFeignClient;

    @Autowired
    private DeliveryRepository orderDeliveryRepository;
    public DeliveryController(MemberServiceFeignClient memberServiceFeignClient, ProductServiceFeignClient productServiceFeignClient) {
        this.memberServiceFeignClient = memberServiceFeignClient;
        this.productServiceFeignClient = productServiceFeignClient;
    }

    @GetMapping("/api/orderdelivery/{id}")
    public String deliveryId(@PathVariable Long id){
        Delivery delivery =  new Delivery(memberServiceFeignClient.getMemberId(id).getName(), productServiceFeignClient.getProductId(id).getProductname(),new Date());
        delivery.setId(memberServiceFeignClient.getMemberId(id).getId());
        orderDeliveryRepository.save(delivery);
        return memberServiceFeignClient.getMemberId(id).getName()+"customers order "
                + productServiceFeignClient.getProductId(id).getProductname() +" " +
        new Date() +" Delivery Ok";
    }
}
