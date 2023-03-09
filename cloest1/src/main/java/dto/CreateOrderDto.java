package dto;

public class CreateOrderDto {
    private Long id_profile;
    private Long id_post;

    public CreateOrderDto(){}
    public CreateOrderDto(Long id_profile,Long id_post){
        this.id_profile=id_profile;
        this.id_post=id_post;
    }
    public Long getId_profile(){return this.id_profile;}
    public void setId_profile(Long id_profile){
        this.id_profile=id_profile;
    }
    public Long getId_post(){return this.id_post;}
    public void setId_post(Long id_post){
        this.id_post=id_post;
    }
}
