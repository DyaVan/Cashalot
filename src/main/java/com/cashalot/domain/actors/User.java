package com.cashalot.domain.actors;

import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.subject.Category;

import java.util.ArrayList;
import java.util.List;


public class User {

    private long id;

    private String name;
    private String email;
    private String password;
    private boolean banned;

    private List<Advertiser> subscriptions = new ArrayList<>();
    private List<Category> interests = new ArrayList<>();

    private List<Advertisement> bookmarks = new ArrayList<>();

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
