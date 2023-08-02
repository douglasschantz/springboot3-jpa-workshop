package com.douglasschantz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasschantz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
