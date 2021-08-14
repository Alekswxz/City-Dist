package Aleksoft.City.Dist.states.repositories;

import Aleksoft.City.Dist.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
