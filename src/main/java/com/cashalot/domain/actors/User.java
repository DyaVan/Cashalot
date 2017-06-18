package com.cashalot.domain.actors;

import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.subject.Category;
import com.cashalot.validation.annotations.UniqueEmail;
import com.cashalot.validation.annotations.ValidEmail;
import org.hibernate.annotations.Fetch;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private int age;

    /**
     * true if male
     */
    @Column
    private boolean sex;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "subscriptions",
            joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "advertiserId", referencedColumnName = "id"))
    private List<Advertiser> subscriptions = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "interests",
            joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "categoryId", referencedColumnName = "id"))
    private List<Category> interests = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "bookmarks",
            joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "advertisementId", referencedColumnName = "id"))
    private List<Advertisement> bookmarks = new ArrayList<>();


    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public List<Advertisement> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(List<Advertisement> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append('}');
        return sb.toString();
    }
}
