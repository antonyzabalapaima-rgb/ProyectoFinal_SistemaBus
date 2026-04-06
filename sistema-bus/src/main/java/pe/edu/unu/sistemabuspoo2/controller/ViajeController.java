package pe.edu.unu.sistemabuspoo2.controller;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.ViajeRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.ViajeResponse;
import pe.edu.unu.sistemabuspoo2.entity.Viaje;
import pe.edu.unu.sistemabuspoo2.service.IViajeService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viaje")
@RequiredArgsConstructor
public class ViajeController {

    private final IViajeService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<ViajeResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(v -> mapper.map(v, ViajeResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<ViajeResponse> save(@RequestBody ViajeRequest dto) {
        Viaje viaje = mapper.map(dto, Viaje.class);
        return ResponseEntity.ok(
                mapper.map(service.save(viaje), ViajeResponse.class)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}