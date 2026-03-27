package entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "VIAJE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer viajeId;

    private LocalDate fecha;
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "BUS_ID")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "RUTA_ID")
    private Ruta ruta;
}