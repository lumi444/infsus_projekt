package model;

import jakarta.persistence.*;

@Entity
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private StatusOrder status_order;

    @ManyToOne
    @JoinColumn(name = "id_profile", nullable = false)
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "id_post", nullable = false)
    private Post post;





}
