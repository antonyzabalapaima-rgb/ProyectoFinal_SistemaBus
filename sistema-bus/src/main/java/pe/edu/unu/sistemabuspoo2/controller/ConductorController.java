package pe.edu.unu.sistemabuspoo2.controller;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.ConductorRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.ConductorResponse;
import pe.edu.unu.sistemabuspoo2.entity.Conductor;
import pe.edu.unu.sistemabuspoo2.service.IConductorService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/conductor")
@RequiredArgsConstructor
public class ConductorController {

    private final IConductorService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<ConductorResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(c -> mapper.map(c, ConductorResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConductorResponse> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                mapper.map(service.findById(id), ConductorResponse.class)
        );
    }

    @PostMapping
    public ResponseEntity<ConductorResponse> save(@RequestBody ConductorRequest dto) {
        Conductor conductor = mapper.map(dto, Conductor.class);
        return ResponseEntity.ok(
                mapper.map(service.save(conductor), ConductorResponse.class)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConductorResponse> update(@PathVariable Integer id,
                                                       @RequestBody ConductorRequest dto) {
        Conductor conductor = mapper.map(dto, Conductor.class);
        conductor.setId(id);
        return ResponseEntity.ok(
                mapper.map(service.update(conductor), ConductorResponse.class)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
