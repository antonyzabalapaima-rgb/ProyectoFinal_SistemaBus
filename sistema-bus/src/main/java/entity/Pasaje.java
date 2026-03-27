package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
    name = "PASAJE",
    uniqueConstraints = @UniqueConstraint(columnNames = {"asiento", "viaje_id"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pasaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pasajeId;

    private Integer asiento;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "VIAJE_ID")
    private Viaje viaje;
}