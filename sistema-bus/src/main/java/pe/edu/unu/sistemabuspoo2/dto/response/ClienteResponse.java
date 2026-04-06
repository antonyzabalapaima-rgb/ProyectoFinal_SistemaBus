package pe.edu.unu.sistemabuspoo2.dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponse {

    private Integer id;
    private PersonaResponse persona;

}