package com.douglasschantz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasschantz.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
