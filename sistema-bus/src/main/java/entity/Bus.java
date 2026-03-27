package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BUS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer busId;

    @Column(unique = true)
    private String placa;

    private Integer capacidad;
}