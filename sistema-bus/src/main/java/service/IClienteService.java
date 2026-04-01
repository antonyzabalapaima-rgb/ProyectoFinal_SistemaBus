package service;

import java.util.List;

import entity.Cliente;
public interface IClienteService {
 
	public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public Cliente update(Cliente cliente);
    public Cliente findById(Integer id);
    public void delete(Integer id);
}
