package net.harshnayak.springdtoproject.repository;

import net.harshnayak.springdtoproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
