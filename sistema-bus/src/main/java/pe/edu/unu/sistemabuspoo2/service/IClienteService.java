package pe.edu.unu.sistemabuspoo2.service;

import java.util.List;


public interface IClienteService {
 
	public List<pe.edu.unu.sistemabuspoo2.entity.Cliente> findAll();
    public pe.edu.unu.sistemabuspoo2.entity.Cliente save(pe.edu.unu.sistemabuspoo2.entity.Cliente cliente);
    public pe.edu.unu.sistemabuspoo2.entity.Cliente update(pe.edu.unu.sistemabuspoo2.entity.Cliente cliente);
    public pe.edu.unu.sistemabuspoo2.entity.Cliente findById(Integer id);
    public void delete(Integer id);
}
