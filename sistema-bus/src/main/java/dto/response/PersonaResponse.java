package dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaResponse {

    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

}