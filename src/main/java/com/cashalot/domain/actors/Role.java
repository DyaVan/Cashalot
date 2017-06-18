package com.cashalot.domain.actors;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String roleName;

    public long getId() {
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















//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
//    private AuthorizationDetails authorizationDetails;

//    @ManyToOne(fetch = FetchType.LAZY,)
//    @JoinColumn(name = "userId",referencedColumnName = "id")
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
