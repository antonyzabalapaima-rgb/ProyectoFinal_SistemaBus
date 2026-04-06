package pe.edu.unu.sistemabuspoo2.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Pasaje;
import pe.edu.unu.sistemabuspoo2.repository.PasajeRepository;
import pe.edu.unu.sistemabuspoo2.service.IPasajeService;


@Service
@RequiredArgsConstructor
public class PasajeServiceImpl implements IPasajeService{

	private final PasajeRepository repository;

    @Override
    public List<Pasaje> findAll() {
        return repository.findAll();
    }

    @Override
    public Pasaje save(Pasaje pasaje) {
        return repository.save(pasaje);
    }

    @Override
    public Pasaje update(Pasaje pasaje) {
        return repository.save(pasaje);
    }

    @Override
    public Pasaje findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
