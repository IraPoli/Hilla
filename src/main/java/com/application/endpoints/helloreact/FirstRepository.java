package com.application.endpoints.helloreact;
import com.application.entity.First;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FirstRepository extends JpaRepository<First, Long> {
}
