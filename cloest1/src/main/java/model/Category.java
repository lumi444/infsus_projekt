package model;

import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String name_category;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name_category = name_category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

}
