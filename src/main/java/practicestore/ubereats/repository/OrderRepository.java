package practicestore.ubereats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import practicestore.ubereats.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(Long userId);
}