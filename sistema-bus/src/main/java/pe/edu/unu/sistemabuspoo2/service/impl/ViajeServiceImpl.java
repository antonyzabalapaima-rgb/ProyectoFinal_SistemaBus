package pe.edu.unu.sistemabuspoo2.service.impl;



import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Viaje;
import pe.edu.unu.sistemabuspoo2.repository.ViajeRepository;
import pe.edu.unu.sistemabuspoo2.service.IViajeService;


@Service
@RequiredArgsConstructor
public class ViajeServiceImpl implements IViajeService {

	private final ViajeRepository repository;

    @Override
    public List<Viaje> findAll() {
        return repository.findAll();
    }

    @Override
    public Viaje save(Viaje viaje) {
        return repository.save(viaje);
    }

    @Override
    public Viaje update(Viaje viaje) {
        return repository.save(viaje);
    }

    @Override
    public Viaje findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
