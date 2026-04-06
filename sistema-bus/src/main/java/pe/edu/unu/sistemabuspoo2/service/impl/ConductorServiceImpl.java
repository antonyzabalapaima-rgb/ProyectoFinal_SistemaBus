package pe.edu.unu.sistemabuspoo2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Conductor;
import pe.edu.unu.sistemabuspoo2.repository.ConductorRepository;
import pe.edu.unu.sistemabuspoo2.service.IConductorService;


@Service
@RequiredArgsConstructor
public class ConductorServiceImpl implements IConductorService {
	private final ConductorRepository repository;

    @Override
    public List<Conductor> findAll() {
        return repository.findAll();
    }

    @Override
    public Conductor save(Conductor conductor) {
        return repository.save(conductor);
    }

    @Override
    public Conductor update(Conductor conductor) {
        return repository.save(conductor);
    }

    @Override
    public Conductor findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}