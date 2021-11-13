package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message="Location is required.")
    @Size(min=1, max=100)
    public String location;


    @OneToMany
    @JoinColumn(name= "employer_id")
    private List<Job> jobs = new ArrayList<>();


    public Employer() {}

    public Employer(String location) {
        super();
        this.location = location;
    }

    //Getters and setters:

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}