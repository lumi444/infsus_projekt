package model;


import jakarta.persistence.*;
import javax.validation.constraints.Size;
@Entity
@Table(name="user")
public class User  {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    @Size(min=0,max=99)
    private String iban;
    @Column(nullable = false)
    private String password;
    @OneToOne
    private UserRole userRole;
    @Column
    private Float wallet;
    @Column
    private Long idArticle;
    @Column
    private String numOfCreditCard;

    public User(Long id,String firstName,String lastName,String username,String email,
                String iban, String password,Float wallet,Long idArticle,String numOfCreditCard, UserRole userRole){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
        this.email=email;
        this.iban=iban;
        this.password=password;
        this.wallet=wallet;
        this.idArticle=idArticle;
        this.numOfCreditCard=numOfCreditCard;
        this.userRole=userRole;

    }
    public User(){

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Float getWallet() {
        return wallet;
    }
    public void setWallet(Float wallet) {
        this.wallet = wallet;
    }
    public Long getIdArticle() {
        return idArticle;
    }
    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }
    public UserRole getUserRole() {
        return userRole;
    }
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }


}
