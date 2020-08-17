package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class CountryStorage {

    private CountryRepository countryRepo;


    public CountryStorage(CountryRepository countryRepo) {
        this.countryRepo = countryRepo;
    }

    public Iterable<Country> getCountries() {
        return countryRepo.findAll();
    }
    public Country findHashtagByHashtag(String name) {
        return countryRepo.findCountryByName(name);
    }

    public void save(Country country) {
        countryRepo.save(country);
    }

    public Country getCountryByName(String name) {
        return countryRepo.findCountryByName(name);
    }
}





