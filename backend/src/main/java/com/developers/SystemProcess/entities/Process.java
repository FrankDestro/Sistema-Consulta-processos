package com.developers.SystemProcess.entities;

import com.developers.SystemProcess.enums.StatusProcess;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_process")
public class Process implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numberProcess;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String courtOrigin;
    private Double valueCause;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date dateProcess;
    private String processType;
    private String judge;
    private String natureProcess;
    private StatusProcess statusProcess;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    public Process() {
    }

    public Process(Long id, Long numberProcess, String title, String description, String courtOrigin, Double valueCause, Date dateProcess, String processType, String judge, String natureProcess, StatusProcess statusProcess, Instant moment) {
        this.id = id;
        this.numberProcess = numberProcess;
        this.title = title;
        this.description = description;
        this.courtOrigin = courtOrigin;
        this.valueCause = valueCause;
        this.dateProcess = dateProcess;
        this.processType = processType;
        this.judge = judge;
        this.natureProcess = natureProcess;
        this.statusProcess = statusProcess;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberProcess() {
        return numberProcess;
    }

    public void setNumberProcess(Long numberProcess) {
        this.numberProcess = numberProcess;
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

    public String getCourtOrigin() {
        return courtOrigin;
    }

    public void setCourtOrigin(String courtOrigin) {
        this.courtOrigin = courtOrigin;
    }

    public Double getValueCause() {
        return valueCause;
    }

    public void setValueCause(Double valueCause) {
        this.valueCause = valueCause;
    }

    public Date getDateProcess() {
        return dateProcess;
    }

    public void setDateProcess(Date dateProcess) {
        this.dateProcess = dateProcess;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getNatureProcess() {
        return natureProcess;
    }

    public void setNatureProcess(String natureProcess) {
        this.natureProcess = natureProcess;
    }

    public StatusProcess getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(StatusProcess statusProcess) {
        this.statusProcess = statusProcess;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Process process = (Process) o;

        return Objects.equals(id, process.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
