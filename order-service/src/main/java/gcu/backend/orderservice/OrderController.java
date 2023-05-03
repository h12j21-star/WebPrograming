package gcu.backend.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final MemberServiceFeignClient memberServiceFeignClient;
    private final ProductServiceFeignClient productServiceFeignClient;

    @Autowired
    private OrderRepository orderRepository;
    public OrderController(MemberServiceFeignClient memberServiceFeignClient, ProductServiceFeignClient productServiceFeignClient) {
        this.memberServiceFeignClient = memberServiceFeignClient;
        this.productServiceFeignClient = productServiceFeignClient;
    }



@GetMapping("/api/order/{id}")
    public String orderId(@PathVariable("id") Long id) {
          return memberServiceFeignClient.getMemberId(id).getName() +
                " " +
                productServiceFeignClient.getProductId(id).getProductname() +
                " " +
                " requested an order.";
            }

     @PostMapping("/api/order/{id}")
    public Order orderCreate(@PathVariable("id") Long id){
        Order order =  new Order(memberServiceFeignClient.getMemberId(id).getName(), productServiceFeignClient.getProductId(id).getProductname());
        order.setId(memberServiceFeignClient.getMemberId(id).getId());

        return  orderRepository.save(order);
    }
 @GetMapping("/api/order")
    public List<Order> getOrder(){
        List <Order> order = orderRepository.findAll();
     return   order;
    }
}
