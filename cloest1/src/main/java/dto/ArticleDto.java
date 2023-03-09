package dto;
public class ArticleDto {
    private String name;

    private String description;

    private Float price;

    private Long category_id;

    private Long owner_id;

    public ArticleDto(){

    }
    public ArticleDto(String name, String description,Float price, Long category_id, Long owner_id){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category_id=category_id;
        this.owner_id=owner_id;
    }
    public String getName(){return this.name;}
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){return this.description;}
    public void setDescription(String description){
        this.description=description;
    }
    public Float getPrice(){return this.price;}
    public void setPrice(Float price){
        this.price=price;
    }
    public Long getCategory_id(){return this.category_id;}
    public void setCategory_id(Long category_id){
        this.category_id=category_id;
    }
    public Long getOwner_id(){return this.owner_id;}
    public void setOwner_id(Long owner_id){
        this.owner_id=owner_id;
    }

}
