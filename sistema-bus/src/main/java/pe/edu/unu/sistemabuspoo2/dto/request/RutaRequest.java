package pe.edu.unu.sistemabuspoo2.dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RutaRequest {

    private String origen;
    private String destino;
    private Double precio;

}