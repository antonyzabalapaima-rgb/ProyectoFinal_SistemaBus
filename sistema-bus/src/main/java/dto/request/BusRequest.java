package dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusRequest {

    private String placa;
    private Integer capacidad;
    private Integer conductorId;

}
