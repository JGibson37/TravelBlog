package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Column(length = 100000)
    @Lob
    private String description;
    @OneToMany(mappedBy = "country")
    private Collection<City> cities;

    protected Country() {
    }

    public Country(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getCountryName() {
        return name;
    }

    public Collection<City> getCities() {
        return cities;
    }

}


