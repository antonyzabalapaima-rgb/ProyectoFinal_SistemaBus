package dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasajeRequest {

    private Integer asiento;
    private Integer clienteId;
    private Integer viajeId;

}