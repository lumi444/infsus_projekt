package model;

import jakarta.persistence.*;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @OneToOne
    @JoinColumn(name = "id_profile", nullable = false)
    private Profile profile;

}
