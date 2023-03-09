package dto;

import model.Category;
import model.User;

public class CreateArticleDto {

    private String name;
    private String description;
    private Float price;

    public CreateArticleDto(){

    }
    public CreateArticleDto(String name, String description, Float price){
        this.name=name;
        this.description=description;
        this.price=price;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


}
