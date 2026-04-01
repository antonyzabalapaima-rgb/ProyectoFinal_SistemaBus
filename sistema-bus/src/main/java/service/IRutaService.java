package service;

import java.util.List;

import entity.Ruta;
public interface IRutaService {

	public List<Ruta> findAll();
    public Ruta save(Ruta ruta);
    public Ruta update(Ruta ruta);
    public Ruta findById(Integer id);
    public void delete(Integer id);
}
