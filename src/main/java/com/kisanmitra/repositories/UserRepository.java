package com.kisanmitra.repositories;

import com.kisanmitra.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
