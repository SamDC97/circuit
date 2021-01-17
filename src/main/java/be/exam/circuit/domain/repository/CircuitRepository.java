package be.exam.circuit.domain.repository;

import be.exam.circuit.domain.CircuitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends JpaRepository<CircuitEntity, Long> {
}
