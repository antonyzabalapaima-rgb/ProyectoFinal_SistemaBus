package pe.edu.unu.sistemabuspoo2.service;
import java.util.List;

import pe.edu.unu.sistemabuspoo2.entity.Pasaje;

public interface IPasajeService {

	 public List<Pasaje> findAll();
	    public Pasaje save(Pasaje pasaje);
	    public Pasaje update(Pasaje pasaje);
	    public Pasaje findById(Integer id);
	    public void delete(Integer id);
}
