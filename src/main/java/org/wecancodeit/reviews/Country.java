package org.wecancodeit.reviews;

import java.util.Collection;

public class Country {

    private String countryName;
    private Collection<City> cities;

    public Country (String countryName, Collection<City> cities){
        this.countryName = countryName;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public Collection<City> getCities() {
        return cities;
    }
}
