package com.belajar.springstartergradle.user_module.repo;

import com.belajar.springstartergradle.user_module.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
