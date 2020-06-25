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
    @ManyToMany(mappedBy = "comments")
    private Collection<City> cities;

    protected Comment() {
    }

    public Comment(String comment, City... cities) {
        this.comment = comment;
        this.cities = new ArrayList<>(Arrays.asList(cities));
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


