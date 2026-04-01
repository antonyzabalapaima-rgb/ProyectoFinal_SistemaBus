package service;

import java.util.List;

import entity.Persona;
public interface IPersonaService {

	public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona update(Persona persona);
    public Persona findById(Integer id);
    public void delete(Integer id);
}
