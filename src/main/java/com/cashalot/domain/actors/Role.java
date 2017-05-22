package com.cashalot.domain.actors;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    private int id;

    @Column
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
