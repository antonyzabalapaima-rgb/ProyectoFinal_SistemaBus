package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import entity.Conductor;

public interface ConductorRepository extends JpaRepository<Conductor, Integer> {

}
