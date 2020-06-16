package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CountryStorage {

    ArrayList<Country> countries = new ArrayList<>();
    public CountryStorage() {
    Country country1 = new Country("Bahamas");
    Country country2 = new Country("Canada");
    Country country3 = new Country("Italy");
    Country country4 = new Country("South Korea");
    Country country5 = new Country("United States");

    public ArrayList<Country> getCountries() {
        return countries;
    }


//    public CountryStorage() {
//        Country country1 = new Country("Bahamas");
//        Country country2 = new Country("Canada");
//        Country country3 = new Country("Italy");
//        Country country4 = new Country("South Korea");
//        Country country5 = new Country("United States");
//
//
//    }

    public Country getCountryByName(String countryName) {
        return countries.get(countryName.indexOf(countryName));


    }
}





