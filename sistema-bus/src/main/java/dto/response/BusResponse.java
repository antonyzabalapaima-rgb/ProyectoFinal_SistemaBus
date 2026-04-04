package dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusResponse {

    private Integer id;
    private String placa;
    private Integer capacidad;
    private ConductorResponse conductor;

}