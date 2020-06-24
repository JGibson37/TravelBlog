package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class CityStorage {
    private CityRepository cityRepo;

    public CityStorage(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }

    public Iterable<City> getCities(){
        return cityRepo.findAll();
    }

    public City findCityByName(String name) {
        return cityRepo.findCityByName(name);
    }

    public void save(City city) {
        cityRepo.save(city);
    }
}