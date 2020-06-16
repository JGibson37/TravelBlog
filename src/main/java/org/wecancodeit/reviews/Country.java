package org.wecancodeit.reviews;



import java.util.Collection;

public class Country {

    private String countryName;



    private Collection<City> cities;

    private Collection<Country> countries;
    public Country(String countryName){
        this.countryName = countryName;
    }


//    public Country(String countryName, Collection <City> cities, Collection<Country> countries) {
//        this.countryName = countryName;
//        this.cities = cities;
//        this.countries = countries;
//
//    }


    public String getCountryName() {
        return countryName;
    }

    public Collection<City> getCities() {
        return cities;
    }

}


