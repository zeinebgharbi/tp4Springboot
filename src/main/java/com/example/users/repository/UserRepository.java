package com.example.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.users.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {

User findByUsername(String username);

}