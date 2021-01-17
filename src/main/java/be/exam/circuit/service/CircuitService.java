package be.exam.circuit.service;

import be.exam.circuit.domain.CircuitEntity;
import be.exam.circuit.domain.repository.CircuitRepository;
import be.exam.circuit.service.dto.Circuit;
import be.exam.circuit.service.mapper.CircuitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CircuitService {

    @Autowired
    private CircuitRepository circuitRepository;
    @Autowired
    private CircuitMapper circuitMapper;

    public void addCircuit(Circuit circuit){
        circuitRepository.save(circuitMapper.toEntity(circuit));
    }

    public List<Circuit> getAll(){
        return StreamSupport.stream(circuitRepository.findAll().spliterator(), false)
                .map( c -> circuitMapper.toDto(c))
                .collect(Collectors.toList());
    }

    public Circuit getById(Long id){
        Optional<CircuitEntity> optionalCircuit = circuitRepository.findById(id);
        if (optionalCircuit.isPresent()){
            return circuitMapper.toDto(optionalCircuit.get());
        }
        return null;
    }
}
