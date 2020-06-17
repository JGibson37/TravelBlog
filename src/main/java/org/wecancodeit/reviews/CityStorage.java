package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CityStorage {
    private CityRepository cityRepo;

    public CityStorage(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }

    public Iterable<City> getCities(){
        return cityRepo.findAll();
    }

    public City getCityByName(String cityName) {
        return cityRepo.findByName(cityName);
    }

}