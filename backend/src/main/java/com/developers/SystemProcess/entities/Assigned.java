package com.developers.SystemProcess.entities;

import com.developers.SystemProcess.entities.pk.AssignedPK;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_assigned")
public class Assigned implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AssignedPK id = new AssignedPK();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant momentAssigned;

    public Assigned() {
    }

    public Assigned(User user, Process process, Instant momentAssigned) {
        id.setUser(user);
        id.setProcess(process);
        this.momentAssigned = momentAssigned;
    }

    public User getStudent() {
        return id.getUser();
    }

    public void setStudent(User user) {
        id.setUser(user);
    }

    public Process getOffer() {
        return id.getProcess();
    }

    public void setOffer(Process process) {
        id.setProcess(process);
    }

    public Instant getMomentAssigned() {
        return momentAssigned;
    }

    public void setMomentAssigned(Instant momentAssigned) {
        this.momentAssigned = momentAssigned;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Assigned other = (Assigned) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}