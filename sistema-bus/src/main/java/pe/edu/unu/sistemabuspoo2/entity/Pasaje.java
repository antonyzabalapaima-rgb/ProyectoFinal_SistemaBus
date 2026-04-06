package pe.edu.unu.sistemabuspoo2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
    name = "pasaje",
    uniqueConstraints = @UniqueConstraint(columnNames = {"asiento", "viaje_id"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pasaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer asiento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "viaje_id")
    private Viaje viaje;
}