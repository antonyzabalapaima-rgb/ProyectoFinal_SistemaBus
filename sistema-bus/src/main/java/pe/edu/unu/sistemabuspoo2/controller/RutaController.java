package pe.edu.unu.sistemabuspoo2.controller;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.RutaRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.RutaResponse;
import pe.edu.unu.sistemabuspoo2.entity.Ruta;
import pe.edu.unu.sistemabuspoo2.service.IRutaService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ruta")
@RequiredArgsConstructor
public class RutaController {

    private final IRutaService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<RutaResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(r -> mapper.map(r, RutaResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<RutaResponse> save(@RequestBody RutaRequest dto) {
        Ruta ruta = mapper.map(dto, Ruta.class);
        return ResponseEntity.ok(
                mapper.map(service.save(ruta), RutaResponse.class)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<RutaResponse> update(@PathVariable Integer id,
                                                  @RequestBody RutaRequest dto) {
        Ruta ruta = mapper.map(dto, Ruta.class);
        ruta.setId(id);
        return ResponseEntity.ok(
                mapper.map(service.update(ruta), RutaResponse.class)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}