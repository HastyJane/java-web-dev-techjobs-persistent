package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.core.convert.Property;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please enter a location")
    @NotBlank
    private String location;


    @OneToMany(mappedBy = "employer")
    private List<Job> jobs =new ArrayList<Job>();


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {}


}
