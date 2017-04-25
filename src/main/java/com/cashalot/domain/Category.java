package com.cashalot.domain;

/**
 * Created by VA-N_ on 25.04.2017.
 */
public class Category {

    static long idCount = 1;

    private final long id;
    private String name;

    private String description;

    public Category(String name, String description) {
        this.id = idCount++;
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
