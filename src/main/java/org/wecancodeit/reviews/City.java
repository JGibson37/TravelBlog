package org.wecancodeit.reviews;

public class City {

    private String cityName;
    private String starRating;
    private String pointOfInterest1;
    private String pointOfInterest2;
    private String review;
    private String photo;



    public City(String cityName, String starRating, String pointOfInterest1, String pointOfInterest2, String review, String photo) {
        this.cityName = cityName;
        this.starRating = starRating;
        this.pointOfInterest1 = pointOfInterest1;
        this.pointOfInterest2 = pointOfInterest2;
        this.review = review;
        this.photo = photo;
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
