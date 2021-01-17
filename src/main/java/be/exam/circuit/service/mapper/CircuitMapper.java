package be.exam.circuit.service.mapper;

import be.exam.circuit.domain.CircuitEntity;
import be.exam.circuit.service.dto.Circuit;
import org.springframework.stereotype.Component;

@Component
public class CircuitMapper {

    public Circuit toDto(CircuitEntity circuitEntity){
        return new Circuit(circuitEntity.getId(), circuitEntity.getName(), circuitEntity.getLength(), circuitEntity.getLocation());
    }

    public CircuitEntity toEntity(Circuit circuit){
        return new CircuitEntity(circuit.getId(), circuit.getName(), circuit.getLength(), circuit.getLocation());
    }
}
