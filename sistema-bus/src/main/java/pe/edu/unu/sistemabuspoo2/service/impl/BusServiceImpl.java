package pe.edu.unu.sistemabuspoo2.service.impl;



import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Bus;
import pe.edu.unu.sistemabuspoo2.service.IBusService;


@Service
@RequiredArgsConstructor
public class BusServiceImpl implements IBusService{
	private final pe.edu.unu.sistemabuspoo2.repository.BusRepository repository;

    @Override
    public List<Bus> findAll() {
        return repository.findAll();
    }

    @Override
    public Bus save(Bus bus) {
        return repository.save(bus);
    }

    @Override
    public Bus update(Bus bus) {
        return repository.save(bus);
    }

    @Override
    public Bus findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
