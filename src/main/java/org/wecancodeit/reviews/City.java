package org.wecancodeit.reviews;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue
    private long id;
    private String cityName;
    private String starRating;
    private String pointOfInterest1;
    private String pointOfInterest2;
    private String review;
    private String photo;
    @ManyToOne
    private Country country;

    protected City(){}

    public City(String cityName, String starRating, String pointOfInterest1, String pointOfInterest2, String review, String photo, Country country) {
        this.cityName = cityName;
        this.starRating = starRating;
        this.pointOfInterest1 = pointOfInterest1;
        this.pointOfInterest2 = pointOfInterest2;
        this.review = review;
        this.photo = photo;
        this.country = country;
    }

    public String getCityName() {
        return cityName;
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

}

