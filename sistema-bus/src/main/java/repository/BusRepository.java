package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

}
