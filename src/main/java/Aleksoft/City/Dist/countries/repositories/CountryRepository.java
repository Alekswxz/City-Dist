package Aleksoft.City.Dist.countries.repositories;

import Aleksoft.City.Dist.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
