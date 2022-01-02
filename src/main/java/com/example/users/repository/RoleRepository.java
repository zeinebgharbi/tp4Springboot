package com.example.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.users.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}