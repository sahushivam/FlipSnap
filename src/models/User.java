package models;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

public class User {

    private String userId;
    private String name;
    private String email;
    LocalDateTime dateOfBirth;
    Set<String> followers;

    public User(String username) {
        this.userId = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(dateOfBirth, user.dateOfBirth) && Objects.equals(followers, user.followers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, email, dateOfBirth, followers);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<String> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<String> followers) {
        this.followers = followers;
    }
}
