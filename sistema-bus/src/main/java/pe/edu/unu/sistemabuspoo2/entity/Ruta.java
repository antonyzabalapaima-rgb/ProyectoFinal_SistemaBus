package pe.edu.unu.sistemabuspoo2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ruta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String origen;
    private String destino;

    private Double precio;
}