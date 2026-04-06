package pe.edu.unu.sistemabuspoo2.service;

import java.util.List;

import pe.edu.unu.sistemabuspoo2.entity.Persona;


public interface IPersonaService {

	public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona update(Persona persona);
    public Persona findById(Integer id);
    public void delete(Integer id);
}
