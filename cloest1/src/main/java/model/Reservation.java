package model;


import org.hibernate.annotations.Entity;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id_reservation;

    @Column(nullable = false)
    private LocalDateTime reservation_start;

    @Column(nullable = false)
    private LocalDateTime reservation_end;

    @ManyToOne
    @JoinColumn(nullable = false,name="client_id")
    private User client;

    @ManyToOne
    @JoinColumn(nullable = false,name="article_id")
    private Article article;

    public Reservation(LocalDateTime reservation_start,
                       LocalDateTime reservation_end, User client, Article article) {
        this.reservation_start = reservation_start;
        this.reservation_end = reservation_end;
        this.client = client;
        this.article = article;
    }

    public Reservation(){}

    public Long getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(Long id_reservation) {
        this.id_reservation = id_reservation;
    }


    public LocalDateTime getReservation_start() {
        return reservation_start;
    }

    public void setReservation_start(LocalDateTime reservation_start) {
        this.reservation_start = reservation_start;
    }

    public LocalDateTime getReservation_end() {
        return reservation_end;
    }

    public void setReservation_end(LocalDateTime reservation_end) {
        this.reservation_end = reservation_end;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Article getParkingSpot() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}