package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {

    City findCityByName (String cityName);
}
