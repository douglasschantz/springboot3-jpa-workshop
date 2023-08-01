package com.douglasschantz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasschantz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
