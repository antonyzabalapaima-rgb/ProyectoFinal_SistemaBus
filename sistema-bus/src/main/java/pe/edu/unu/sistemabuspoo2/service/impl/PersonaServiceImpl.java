package pe.edu.unu.sistemabuspoo2.service.impl;
import lombok.RequiredArgsConstructor;
import pe.edu.unu.sistemabuspoo2.entity.Persona;
import pe.edu.unu.sistemabuspoo2.repository.PersonaRepository;
import pe.edu.unu.sistemabuspoo2.service.IPersonaService;

import org.springframework.stereotype.Service;



import java.util.List;

@Service
@RequiredArgsConstructor

public class PersonaServiceImpl implements IPersonaService{

	private final PersonaRepository repository;

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Persona findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

