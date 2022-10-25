package com.developers.SystemProcess.dto;

import com.developers.SystemProcess.entities.Process;
import com.developers.SystemProcess.enums.StatusProcess;

import java.time.Instant;
import java.util.Date;

public class ProcessDTO {

    private Long id;
    private Long numberProcess;
    private String title;
    private String description;
    private String courtOrigin;
    private Double valueCause;
    private Date dateProcess;
    private String processType;
    private String judge;
    private String natureProcess;
    private StatusProcess statusProcess;
    private Instant moment;

    public ProcessDTO() {
    }

    public ProcessDTO(Long id, Long numberProcess, String title, String description, String courtOrigin, Double valueCause, Date dateProcess, String processType, String judge, String natureProcess, StatusProcess statusProcess, Instant moment) {
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

    public ProcessDTO(Process entity) {
        id = entity.getId();
        numberProcess = entity.getNumberProcess();
        title = entity.getTitle();
        description = entity.getDescription();
        courtOrigin = entity.getCourtOrigin();
        valueCause = entity.getValueCause();
        dateProcess = entity.getDateProcess();
        processType = entity.getProcessType();
        judge = entity.getJudge();
        natureProcess = entity.getNatureProcess();
        statusProcess = entity.getStatusProcess();
        moment = entity.getMoment();
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
}