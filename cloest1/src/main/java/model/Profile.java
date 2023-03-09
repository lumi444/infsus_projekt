package model;

import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name="profile")
public class Profile {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    @Size(min=1, max=20)
    private String username;

    @Column(nullable = false)
    private Double grade;


    @OneToOne
    @JoinColumn(name = "id_profile", referencedColumnName = "id", nullable = false)
    private User user;

    public Profile() {
    }

    public Profile(Long id, String username, Double grade,User user) {
        this.id=id;
        this.username = username;
        this.grade = grade;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
