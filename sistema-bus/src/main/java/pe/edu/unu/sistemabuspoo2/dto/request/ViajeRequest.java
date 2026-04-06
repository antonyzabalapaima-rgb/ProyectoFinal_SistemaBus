package pe.edu.unu.sistemabuspoo2.dto.request;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ViajeRequest {

    private LocalDate fecha;
    private LocalTime hora;
    private Integer busId;
    private Integer rutaId;

}