package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class City {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String starRating;
    private String pointOfInterest1;
    private String pointOfInterest2;
    @Column (length = 100000)
    @Lob
    private String review;
    private String photo;
    @ManyToOne
    private Country country;
    @ManyToMany
    private Collection<Hashtag> hashtags;

    protected City(){}

    public City(String name, String starRating, String pointOfInterest1, String pointOfInterest2, String review, String photo, Country country, Hashtag ... hashtags) {
        this.name = name;
        this.starRating = starRating;
        this.pointOfInterest1 = pointOfInterest1;
        this.pointOfInterest2 = pointOfInterest2;
        this.review = review;
        this.photo = photo;
        this.country = country;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public String getCityName() {
        return name;
    }

    public String getStarRating() {
        return starRating;
    }

    public String getPointOfInterest1() {
        return pointOfInterest1;
    }

    public String getPointOfInterest2() {
        return pointOfInterest2;
    }

    public String getReview() {
        return review;
    }

    public String getPhoto() {
        return photo;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }



}

