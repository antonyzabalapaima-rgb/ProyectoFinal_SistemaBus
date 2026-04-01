package service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Conductor;
import lombok.RequiredArgsConstructor;
import repository.ConductorRepository;
import service.IConductorService;

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