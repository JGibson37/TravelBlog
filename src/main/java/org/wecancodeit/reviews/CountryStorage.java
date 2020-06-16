package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class CountryStorage {

    private CountryRepository countryRepo;


    public CountryStorage(CountryRepository countryRepo) {



//    Country country1 = new Country("Bahamas");
//    Country country2 = new Country("Canada");
//    Country country3 = new Country("Italy");
//    Country country4 = new Country("South Korea");
//    Country country5 = new Country("United States");
        this.countryRepo = countryRepo;
    }
    public Iterable<Country> getCountries() {
        return countryRepo.findAll();
    }




    public Country getCountryByName(String countryName) {
        return countryRepo.findByName(countryName);


    }
}





