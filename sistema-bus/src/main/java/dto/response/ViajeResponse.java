package dto.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ViajeResponse {

    private Integer id;
    private LocalDate fecha;
    private LocalTime hora;
    private BusResponse bus;
    private RutaResponse ruta;

}