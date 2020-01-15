package be.digicom.eventsmanager.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long identifier;
    private String name;
    private String description;
    private double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private EventStatusType status = EventStatusType.SCHEDULED;
    private PostalAddress venue;

/*    //@JsonIgnore
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<EventsAttendees> attendees = new ArrayList<>();*/

    public Event() {}

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public EventStatusType getStatus() {
        return status;
    }

    public void setStatus(EventStatusType status) {
        this.status = status;
    }

    public PostalAddress getVenue() {
        return venue;
    }

    public void setVenue(PostalAddress venue) {
        this.venue = venue;
    }
}
