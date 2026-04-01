package service;
import java.util.List;

import entity.Pasaje;
public interface IPasajeService {

	 public List<Pasaje> findAll();
	    public Pasaje save(Pasaje pasaje);
	    public Pasaje update(Pasaje pasaje);
	    public Pasaje findById(Integer id);
	    public void delete(Integer id);
}
