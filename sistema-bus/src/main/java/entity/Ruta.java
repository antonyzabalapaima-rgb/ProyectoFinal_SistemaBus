package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "RUTA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rutaId;

    private String origen;
    private String destino;
    private Double precio;
}