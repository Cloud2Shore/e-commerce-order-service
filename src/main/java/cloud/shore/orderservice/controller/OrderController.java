package cloud.shore.orderservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/order/{orderId}/status")
    public void updateOrderStatus(@PathVariable("orderId") String orderId, @RequestBody String status) {
        // Simulate order status update
    }
}

