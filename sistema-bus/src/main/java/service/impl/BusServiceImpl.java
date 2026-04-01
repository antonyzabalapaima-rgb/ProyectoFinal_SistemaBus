package service.impl;

import service.IBusService;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Bus;
import lombok.RequiredArgsConstructor;
import repository.BusRepository;

@Service
@RequiredArgsConstructor
public class BusServiceImpl implements IBusService{
	private final BusRepository repository;

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
