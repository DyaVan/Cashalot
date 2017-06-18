package com.cashalot.domain.appflow;


import javax.persistence.*;

@Entity
@Table(name = "tagbindings")
public class TagBinding {

    @Id
    @GeneratedValue
    Long id;

    @Column
    Long tagId;

    @Column
    Long subjectId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }



}
