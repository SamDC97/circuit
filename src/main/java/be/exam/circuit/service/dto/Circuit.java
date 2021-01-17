package be.exam.circuit.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circuit {

    private Long id;
    private String name;
    private Long length;
    private String location;
}
