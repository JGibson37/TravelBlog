package org.wecancodeit.reviews;

import java.util.Collection;

public class Hashtags {

    private String hashtag;
    private Collection<City> cities;

    public String getHashtag() {
        return hashtag;
    }

    public Collection<City> getCities() {
        return cities;
    }

    public Hashtags(String hashtag, Collection<City> cities){
        this.hashtag = hashtag;
        this.cities = cities;
    }
}
