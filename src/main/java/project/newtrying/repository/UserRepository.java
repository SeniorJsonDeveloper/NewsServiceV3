package project.newtrying.repository;

import project.newtrying.models.entitites.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(Long id);
    User createUser(User user);
    User updateUser(User user);
    void deleteById(Long id);

}
