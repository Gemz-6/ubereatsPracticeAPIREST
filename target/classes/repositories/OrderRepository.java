package repositories;

import entity.User;

public interface OrderRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}