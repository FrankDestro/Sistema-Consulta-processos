package com.developers.SystemProcess.entities.pk;

import com.developers.SystemProcess.entities.Process;
import com.developers.SystemProcess.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AssignedPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "process_id")
    private Process process;

    public AssignedPK() {
    }

    public AssignedPK(User user, Process process) {
        this.user = user;
        this.process = process;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((process == null) ? 0 : process.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignedPK that = (AssignedPK) o;
        return Objects.equals(user, that.user) && Objects.equals(process, that.process);
    }
}
