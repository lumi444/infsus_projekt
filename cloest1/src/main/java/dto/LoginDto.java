package dto;

import org.springframework.util.Assert;

public class LoginDto {
    private String username;
    private String password;

    public LoginDto(String username, String password){
        Assert.notNull(username,"Username must be set, not null");
        Assert.notNull(password,"Password must be set, not null");

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }
}