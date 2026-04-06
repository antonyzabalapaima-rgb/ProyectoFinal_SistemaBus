package pe.edu.unu.sistemabuspoo2.service;

import java.util.List;

import pe.edu.unu.sistemabuspoo2.entity.Bus;


public interface IBusService {

	public List<pe.edu.unu.sistemabuspoo2.entity.Bus> findAll();
    public pe.edu.unu.sistemabuspoo2.entity.Bus save(Bus bus);
    public pe.edu.unu.sistemabuspoo2.entity.Bus update(Bus bus);
    public pe.edu.unu.sistemabuspoo2.entity.Bus findById(Integer id);
    public void delete(Integer id);
}
