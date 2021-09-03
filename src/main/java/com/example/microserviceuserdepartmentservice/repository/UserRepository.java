package com.example.microserviceuserdepartmentservice.repository;

import com.example.microserviceuserdepartmentservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
}
