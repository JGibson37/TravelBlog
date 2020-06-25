package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String comment;
    private String comment1;
    private String comment2;
    @ManyToMany(mappedBy = "comments")
    private Collection<City> cities;

    protected Comment() {
    }

    public Comment(String comment, String comment1, String comment2, City... cities) {
        this.comment = comment;
        this.comment1 = comment1;
        this.comment2 = comment2;
        this.cities = new ArrayList<>(Arrays.asList(cities));
    }

    public String getComment1() {
        return comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Collection<City> getCities() {
        return cities;
    }
}


