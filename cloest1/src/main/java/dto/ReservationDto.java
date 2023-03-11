package dto;

import model.Article;
import model.Reservation;
import model.User;

import java.time.LocalDateTime;

public class ReservationDto {
    private LocalDateTime reservation_start;
    private LocalDateTime reservation_end;
    private User client;
    private Article article;
    public ReservationDto(){}
    public ReservationDto(LocalDateTime reservation_start,LocalDateTime reservation_end,
                          User client,Article article){
        this.reservation_start=reservation_start;
        this.reservation_end=reservation_end;
        this.client=client;
        this.article=article;
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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
