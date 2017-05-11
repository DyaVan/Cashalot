package com.cashalot.domain.actors;

import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.subject.Category;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private long id;

    private String name;
    private String email;
    private boolean banned;

    private List<Advertiser> subscriptions = new ArrayList<>();
    private List<Category> interests = new ArrayList<>();

    private List<Advertisement> bookmarks = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.banned = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Advertiser> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Advertiser> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Category> getInterests() {
        return interests;
    }

    public void setInterests(List<Category> interests) {
        this.interests = interests;
    }

    public void subscribe(Category interestingCategory) {
        interests.add(interestingCategory);
    }

    public void subscribe(Advertiser interestingAdvertiser) {
        subscriptions.add(interestingAdvertiser);
    }

    public void unsubscribe(Category interestingCategory) {
        interests.remove(interestingCategory);
    }

    public void unsubscribe(Advertiser interestingAdvertiser) {
        subscriptions.remove(interestingAdvertiser);
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
}
