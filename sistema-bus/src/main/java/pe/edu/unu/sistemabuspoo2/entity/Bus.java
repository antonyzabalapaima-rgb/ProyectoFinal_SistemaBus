package pe.edu.unu.sistemabuspoo2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String placa;

    private Integer capacidad;

    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;
}