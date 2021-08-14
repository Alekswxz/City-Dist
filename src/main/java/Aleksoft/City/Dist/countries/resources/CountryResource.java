package Aleksoft.City.Dist.countries.resources;

import Aleksoft.City.Dist.countries.entities.Country;

import Aleksoft.City.Dist.countries.repositories.CountryRepository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }


  @GetMapping
  public Page<Country> countries(Pageable page) {

    return repository.findAll(page);
  }
}
