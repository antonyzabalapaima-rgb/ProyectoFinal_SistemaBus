package pe.edu.unu.sistemabuspoo2.service;

import java.util.List;

import pe.edu.unu.sistemabuspoo2.entity.Conductor;


public interface IConductorService {

	public List<Conductor> findAll();
    public Conductor save(Conductor conductor);
    public Conductor update(Conductor conductor);
    public Conductor findById(Integer id);
    public void delete(Integer id);
}
