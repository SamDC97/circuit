package be.exam.circuit.web;

import be.exam.circuit.service.CircuitService;
import be.exam.circuit.service.dto.Circuit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CircuitResource {

    @Autowired
    private CircuitService circuitService;

    @PostMapping("/add-circuit")
    private void addCircuit(@RequestBody Circuit circuit){
        circuitService.addCircuit(circuit);
    }

    @GetMapping("/circuits")
    private ResponseEntity<List<Circuit>> getAll(){
        List<Circuit> circuitList = circuitService.getAll();
        return new ResponseEntity<>(circuitList, HttpStatus.OK);
    }

    @GetMapping("/circuit/{id}")
    private ResponseEntity<Circuit> getById(@PathVariable Long id){
        return new ResponseEntity<>(circuitService.getById(id), HttpStatus.OK);
    }
}
