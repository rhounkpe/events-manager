package be.digicom.eventsmanager.model;

import javax.persistence.*;

@Entity(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String legalName;
    private String email;
    private PostalAddress location;

    /*
    private List<ContactPoint> contactPoints = new ArrayList<>();
    private List<Person> founders = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private List<Event> sponsoredEvents = new ArrayList<>();
    */

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PostalAddress getLocation() {
        return location;
    }

    public void setLocation(PostalAddress location) {
        this.location = location;
    }
}
