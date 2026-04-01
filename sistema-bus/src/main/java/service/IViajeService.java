package service;

import java.util.List;

import entity.Viaje;
public interface IViajeService {

	 public List<Viaje> findAll();
	    public Viaje save(Viaje viaje);
	    public Viaje update(Viaje viaje);
	    public Viaje findById(Integer id);
	    public void delete(Integer id);
}
