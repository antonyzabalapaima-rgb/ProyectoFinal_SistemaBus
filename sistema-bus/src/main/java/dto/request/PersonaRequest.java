package dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaRequest {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

}