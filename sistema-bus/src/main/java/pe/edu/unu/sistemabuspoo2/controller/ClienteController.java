package pe.edu.unu.sistemabuspoo2.controller;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.dto.request.ClienteRequest;
import pe.edu.unu.sistemabuspoo2.dto.response.ClienteResponse;
import pe.edu.unu.sistemabuspoo2.entity.Cliente;
import pe.edu.unu.sistemabuspoo2.service.IClienteService;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final IClienteService service;
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> findAll() {
        return ResponseEntity.ok(
                service.findAll().stream()
                        .map(c -> mapper.map(c, ClienteResponse.class))
                        .collect(Collectors.toList())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                mapper.map(service.findById(id), ClienteResponse.class)
        );
    }

    @PostMapping
    public ResponseEntity<ClienteResponse> save(@RequestBody ClienteRequest dto) {
        Cliente cliente = mapper.map(dto, Cliente.class);
        return ResponseEntity.ok(
                mapper.map(service.save(cliente), ClienteResponse.class)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponse> update(@PathVariable Integer id,
                                                     @RequestBody ClienteRequest dto) {
        Cliente cliente = mapper.map(dto, Cliente.class);
        cliente.setId(id);
        return ResponseEntity.ok(
                mapper.map(service.update(cliente), ClienteResponse.class)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}