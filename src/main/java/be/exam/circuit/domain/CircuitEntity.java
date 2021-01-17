package be.exam.circuit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CircuitEntity {

    @Id
    private Long id;
    private String name;
    private Long length;
    private String location;
}
