package service.impl;

import service.IClienteService;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Cliente;
import lombok.RequiredArgsConstructor;
import repository.ClienteRepository;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {

	
	 private final ClienteRepository repository;

	    @Override
	    public List<Cliente> findAll() {
	        return repository.findAll();
	    }

	    @Override
	    public Cliente save(Cliente cliente) {
	        return repository.save(cliente);
	    }

	    @Override
	    public Cliente update(Cliente cliente) {
	        return repository.save(cliente);
	    }

	    @Override
	    public Cliente findById(Integer id) {
	        return repository.findById(id).orElseThrow();
	    }

	    @Override
	    public void delete(Integer id) {
	        repository.deleteById(id);
	    }
	}

