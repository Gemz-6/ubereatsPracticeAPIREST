package practicestore.ubereats.controller;

import org.springframework.web.bind.annotation.RestController;

import practicestore.ubereats.dto.OrderDTO;
import practicestore.ubereats.service.OrderService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<OrderDTO> getMethodName(@RequestParam Long userId) {
        return orderService.getOrders(userId);
    }

}
