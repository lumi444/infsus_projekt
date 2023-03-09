package service;

import dto.UserDto;
import model.User;

import java.util.List;
import java.util.Optional;

public interface AuthenticationService {
    List<User> listAll();

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User updateUser(User user);


    User deleteUser(Long userId);

    String singUpUser(User user);

    Optional<User> findById(long userId);

    User fetch(long userId);
    Optional<User> findUser(String username, String password);

}
