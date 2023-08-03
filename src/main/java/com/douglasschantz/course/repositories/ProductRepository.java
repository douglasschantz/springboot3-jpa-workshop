package com.douglasschantz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasschantz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
