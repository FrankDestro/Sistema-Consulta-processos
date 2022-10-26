package com.developers.SystemProcess.entities;

import com.developers.SystemProcess.enums.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tb_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Long cpf;
    @Column(unique = true)
    private String email;
    private String password;
    private Long telephone;
    private Long mobile;
    @Column(columnDefinition = "TEXT")
    private String address;
    private String city;
    private String state;
    private Long barAssociaton;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date admissionData;
    private Status status;
    private String party;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Event> events = new ArrayList<>();

    public User() {
    }

    public User(Long id, String firstName, String lastName, Long cpf, String email, String password, Long telephone, Long mobile, String address, String city, String state, Long barAssociaton, Date admissionData, Status status, String party) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.mobile = mobile;
        this.address = address;
        this.city = city;
        this.state = state;
        this.barAssociaton = barAssociaton;
        this.admissionData = admissionData;
        this.status = status;
        this.party = party;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getBarAssociaton() {
        return barAssociaton;
    }

    public void setBarAssociaton(Long barAssociaton) {
        this.barAssociaton = barAssociaton;
    }

    public Date getAdmissionData() {
        return admissionData;
    }

    public void setAdmissionData(Date admissionData) {
        this.admissionData = admissionData;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
