package net.harshnayak.springdtoproject.repository;

import net.harshnayak.springdtoproject.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationtRepository extends JpaRepository<Location,Long> {
}
