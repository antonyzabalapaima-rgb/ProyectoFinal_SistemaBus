package pe.edu.unu.sistemabuspoo2.controller;

import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.PersonaRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.PersonaResponse;
import pe.edu.unu.sistemabuspoo2.entity.Persona;
import pe.edu.unu.sistemabuspoo2.service.IPersonaService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final IPersonaService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<PersonaResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(p -> mapper.map(p, PersonaResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<PersonaResponse> save(@RequestBody PersonaRequest dto) {
        Persona persona = mapper.map(dto, Persona.class);
        return ResponseEntity.ok(
                mapper.map(service.save(persona), PersonaResponse.class)
        );
    }
}