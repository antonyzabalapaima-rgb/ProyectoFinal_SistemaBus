package service.impl;

import service.IPasajeService;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Pasaje;
import lombok.RequiredArgsConstructor;
import repository.PasajeRepository;

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
