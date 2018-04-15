package kz.kaznitu.lessons.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 6,max = 12, message = "Error City: length 6 or 12")
    private String city;
    @Size(min = 6, max = 12, message = "Error Region: length 6 or 12")
    private String region;

    public Skill(){
        super(); }

    public Skill(int id, String city,String region){
        this.id = id;
        this.city = city;
        this.region = region;
    }
    public Skill(String city,String region){
        this.city = city;
        this.region = region;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
