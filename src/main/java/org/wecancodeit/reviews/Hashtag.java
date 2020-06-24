package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    private long id;
    private String hashtag;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<City> cities;

    protected Hashtag() {
    }

    public Hashtag(String hashtag, City... cities) {
        this.hashtag = hashtag;
        this.cities = new ArrayList<>(Arrays.asList(cities));
    }
    public long getId() {
        return id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Collection<City> getCities() {
        return cities;
    }
}
