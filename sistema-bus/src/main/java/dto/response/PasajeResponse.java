package dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasajeResponse {

    private Integer id;
    private Integer asiento;
    private ClienteResponse cliente;
    private ViajeResponse viaje;

}