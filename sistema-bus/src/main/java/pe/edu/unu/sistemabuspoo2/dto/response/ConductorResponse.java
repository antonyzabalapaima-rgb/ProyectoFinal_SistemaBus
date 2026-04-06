package pe.edu.unu.sistemabuspoo2.dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConductorResponse {

    private Integer id;
    private String licencia;
    private PersonaResponse persona;

}