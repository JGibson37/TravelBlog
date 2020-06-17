package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {

     Country findCountryByName(String countryName);

}
