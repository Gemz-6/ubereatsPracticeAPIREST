package practicestore.ubereats.service;

import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import practicestore.ubereats.dto.OrderDTO;
import practicestore.ubereats.repository.OrderRepository;
import practicestore.ubereats.repository.UserRepository;
import practicestore.ubereats.entity.Order;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public List<OrderDTO> getOrders(Long userId) {
        List<Order> orders = orderRepository.findByUserId(userId);
        List<OrderDTO> response = orders.stream().map(order -> new OrderDTO()).toList();
        return response;
    }

}
