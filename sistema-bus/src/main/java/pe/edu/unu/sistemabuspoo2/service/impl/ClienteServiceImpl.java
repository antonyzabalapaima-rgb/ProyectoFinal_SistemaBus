package pe.edu.unu.sistemabuspoo2.service.impl;



import java.util.List;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Cliente;
import pe.edu.unu.sistemabuspoo2.repository.ClienteRepository;
import pe.edu.unu.sistemabuspoo2.service.IClienteService;


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

