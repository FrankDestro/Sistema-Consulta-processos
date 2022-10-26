package com.developers.SystemProcess.dto;

import com.developers.SystemProcess.entities.Attachment;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.Instant;

public class AttachmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String url;
    private Instant moment;

    public AttachmentDTO() {
    }

    public AttachmentDTO(Long id, String url, Instant moment) {
        this.id = id;
        this.url = url;
        this.moment = moment;
    }

    public AttachmentDTO(Attachment entity) {
        id = entity.getId();
        url = entity.getUrl();
        moment = entity.getMoment();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}
