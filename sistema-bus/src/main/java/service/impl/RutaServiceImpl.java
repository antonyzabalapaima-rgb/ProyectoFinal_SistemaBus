package service.impl;

import service.IRutaService;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Ruta;
import lombok.RequiredArgsConstructor;
import repository.RutaRepository;

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

