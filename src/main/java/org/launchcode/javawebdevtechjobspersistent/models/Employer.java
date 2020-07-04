package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please enter a location")
    @ManyToOne
    private String location;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {}
    
}
