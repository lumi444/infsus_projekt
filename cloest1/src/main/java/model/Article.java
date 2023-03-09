package model;

import jakarta.persistence.*;


@Entity
@Table(name="article")
public class Article {
    @Id
    @GeneratedValue
    private Long id_article;

    @Column(unique=true,nullable=false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private Float price;

    @OneToOne
    @Column(nullable = false,name="category_id")
    private Category category;

    @OneToOne
    @JoinColumn(nullable = false,name="owner_id")
    private User owner;

    public Article(){

    }
    public Article(Long id_article,String name,Float price, Category category,User owner){
        this.id_article=id_article;
        this.name=name;
        this.price=price;
        this.category=category;
        this.owner=owner;
    }
    public Long getId_article(){return this.id_article;}

    public void setId_article(Long id_article){
        this.id_article=id_article;
    }
    public String getName(){return this.name;}

    public void setName(String name){
        this.name=name;
    }
    public Float getPrice() {
        return this.price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Category getCategory(){return this.category;}

    public void setCategory(Category category){
        this.category=category;
    }
    public User getOwner(){return this.owner;}

    public void setOwner(User owner){
        this.owner=owner;
    }
}
