package pe.edu.unu.sistemabuspoo2.controller;



import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.response.BusResponse;
import pe.edu.unu.sistemabuspoo2.entity.Bus;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bus")
@RequiredArgsConstructor
public class BusController {

    private final pe.edu.unu.sistemabuspoo2.service.IBusService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<pe.edu.unu.sistemabuspoo2.dto.response.BusResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(b -> mapper.map(b, BusResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<pe.edu.unu.sistemabuspoo2.dto.response.BusResponse> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                mapper.map(service.findById(id), pe.edu.unu.sistemabuspoo2.dto.response.BusResponse.class)
        );
    }

    @PostMapping
    public ResponseEntity<pe.edu.unu.sistemabuspoo2.dto.response.BusResponse> save(@RequestBody pe.edu.unu.sistemabuspoo2.dto.request.BusRequest dto) {
        pe.edu.unu.sistemabuspoo2.entity.Bus bus = mapper.map(dto, pe.edu.unu.sistemabuspoo2.entity.Bus.class);
        return ResponseEntity.ok(
                mapper.map(service.save(bus), pe.edu.unu.sistemabuspoo2.dto.response.BusResponse.class)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<pe.edu.unu.sistemabuspoo2.dto.response.BusResponse> update(@PathVariable Integer id,
                                                 @RequestBody pe.edu.unu.sistemabuspoo2.dto.request.BusRequest dto) {
        Bus bus = mapper.map(dto, pe.edu.unu.sistemabuspoo2.entity.Bus.class);
        bus.setId(id);
        return ResponseEntity.ok(
                mapper.map(service.update(bus), pe.edu.unu.sistemabuspoo2.dto.response.BusResponse.class)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}