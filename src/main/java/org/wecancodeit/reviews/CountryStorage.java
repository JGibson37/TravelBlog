package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CountryStorage {

    ArrayList<Country> countries = new ArrayList<>();
    Country country1 = new Country("Bahamas");
    Country country2 = new Country("Canada");
    Country country3 = new Country("Italy");
    Country country4 = new Country("South Korea");
    Country country5 = new Country("United States");

    public ArrayList<Country> getCountries() {
        return countries;
    }
//    public CountryStorage(){
//        countries.put("Bahamas", new Country("Bahamas","Nassau","Lucaya"));
//        countries.put("Canada", new Country("Canada", "Bruce Peninsula", "Stratford"));
//        countries.put("Italy", new Country("Italy","Cinque Terre","Florence"));
//        countries.put("South Korea", new Country("South Korea","Jeju Island","Seoul"));
//        countries.put("United States", new Country("United States", "Gettysburg", "Miami"));
//    }

 //  public Country findCountryByName(String countryName){
 //       return countries.get(countryName);
  //  }
//    public Collection<Country> findAllCities(){
//        return countries.values();
//    }

}





