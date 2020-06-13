package org.wecancodeit.reviews;

import java.util.Collection;

public class Country {

    private String countryName;
    private String city1;
    private String city2;

    public Country (String countryName, String city1, String city2){
        this.countryName = countryName;
        this.city1 = city1;
        this.city2 = city2;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCity1() {
        return city1;
    }

    public String getCity2() {
        return city2;
    }
}
