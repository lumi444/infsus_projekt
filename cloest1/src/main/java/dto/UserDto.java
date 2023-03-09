package dto;

public class UserDto {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String iban;
    private String password;
    private Float wallet;
    private String numOfCreditCard;

    public UserDto (){

    }
    public UserDto(String firstName, String lastName,String username,String email,
                   String iban, String password, Float wallet, String numOfCreditCard){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
        this.email=email;
        this.iban=iban;
        this.password=password;
        this.wallet=wallet;
        this.numOfCreditCard=numOfCreditCard;
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
    public String getNumOfCreditCard() {
        return numOfCreditCard;
    }
    public void setNumOfCreditCard(String numOfCreditCard) {
        this.numOfCreditCard = numOfCreditCard;
    }

}
