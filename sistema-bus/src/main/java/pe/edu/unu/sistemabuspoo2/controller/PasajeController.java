package pe.edu.unu.sistemabuspoo2.controller;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.PasajeRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.PasajeResponse;
import pe.edu.unu.sistemabuspoo2.entity.Pasaje;
import pe.edu.unu.sistemabuspoo2.service.IPasajeService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pasaje")
@RequiredArgsConstructor
public class PasajeController {

    private final IPasajeService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<PasajeResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(p -> mapper.map(p, PasajeResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<PasajeResponse> save(@RequestBody PasajeRequest dto) {
        Pasaje pasaje = mapper.map(dto, Pasaje.class);
        return ResponseEntity.ok(
                mapper.map(service.save(pasaje), PasajeResponse.class)
        );
    }
}