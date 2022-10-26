package com.developers.SystemProcess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_event")
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date eventDate;
    private String eventHour;
    private String locality;
    @Column(columnDefinition="TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Event() {
    }

    public Event(Long id, String title, Date eventDate, String eventHour, String locality, String description, User user) {
        this.id = id;
        this.title = title;
        this.eventDate = eventDate;
        this.eventHour = eventHour;
        this.locality = locality;
        this.description = description;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventHour() {
        return eventHour;
    }

    public void setEventHour(String eventHour) {
        this.eventHour = eventHour;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
