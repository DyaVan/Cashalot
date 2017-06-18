package com.cashalot.domain.subject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    private long id;

    @Column
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "tags")
    private List<Subject> subjectsWithTag;

    public Tag(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectsWithTag() {
        return subjectsWithTag;
    }

    public void setSubjectsWithTag(List<Subject> subjectsWithTag) {
        this.subjectsWithTag = subjectsWithTag;
    }
}
