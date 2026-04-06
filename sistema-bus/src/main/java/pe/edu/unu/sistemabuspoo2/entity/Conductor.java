package pe.edu.unu.sistemabuspoo2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conductor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String licencia;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}