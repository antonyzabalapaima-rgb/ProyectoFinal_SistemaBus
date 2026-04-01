package service;

import java.util.List;

import entity.Bus;
public interface IBusService {

	public List<Bus> findAll();
    public Bus save(Bus bus);
    public Bus update(Bus bus);
    public Bus findById(Integer id);
    public void delete(Integer id);
}
