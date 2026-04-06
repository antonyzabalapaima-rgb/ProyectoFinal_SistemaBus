package pe.edu.unu.sistemabuspoo2.service.impl;



import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Ruta;
import pe.edu.unu.sistemabuspoo2.repository.RutaRepository;
import pe.edu.unu.sistemabuspoo2.service.IRutaService;


@Service
@RequiredArgsConstructor
public class RutaServiceImpl implements IRutaService {

	private final RutaRepository repository;

    @Override
    public List<Ruta> findAll() {
        return repository.findAll();
    }

    @Override
    public Ruta save(Ruta ruta) {
        return repository.save(ruta);
    }

    @Override
    public Ruta update(Ruta ruta) {
        return repository.save(ruta);
    }

    @Override
    public Ruta findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

