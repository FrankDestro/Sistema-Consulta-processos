package com.developers.SystemProcess.dto;

import com.developers.SystemProcess.entities.ProgressProcess;

import java.io.Serializable;
import java.time.Instant;

public class ProgressProcessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
    private Instant moment;

    public ProgressProcessDTO() {
    }

    public ProgressProcessDTO(Long id, String title, String description, Instant moment) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.moment = moment;
    }

    public ProgressProcessDTO(ProgressProcess entity) {
        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        moment = entity.getMoment();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}
