package pe.edu.unu.sistemabuspoo2.dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RutaResponse {

    private Integer id;
    private String origen;
    private String destino;
    private Double precio;

}