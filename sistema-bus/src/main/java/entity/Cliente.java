package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CLIENTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clienteId;

    private String nombre;
    private String apellido;

    @Column(unique = true)
    private String dni;

    private String telefono;
}