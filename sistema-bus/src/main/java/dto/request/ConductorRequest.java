package dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConductorRequest {

    private String licencia;
    private Integer personaId;

}