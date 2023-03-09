package model;

import jakarta.persistence.*;

@Entity
@Table(name="closet")
public class Closet {
    @Id
    @GeneratedValue
    private Long id_parking;

    @Column(unique=true,nullable=false)
    private String name;

    @Column
    private String description;
    @OneToOne
    @JoinColumn(nullable = false,name="profile_id")
    private Profile owner;

    public Closet(){

    }
    public Closet(Long id_parking,String name, String description,Profile owner){
        this.id_parking=id_parking;
        this.name=name;
        this.description=description;
        this.owner=owner;
    }
    public Long getId_parking() {
        return id_parking;
    }
    public void setId_parking(Long id_parking) {
        this.id_parking = id_parking;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Profile getOwner() {
        return owner;
    }
    public void setOwner(Profile owner) {
        this.owner = owner;
    }


}