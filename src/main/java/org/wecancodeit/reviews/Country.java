package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "country")
    private Collection<City> cities;

 protected Country(){}
    public Country(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return name;
    }

    public Collection<City> getCities() {
        return cities;
    }

}


