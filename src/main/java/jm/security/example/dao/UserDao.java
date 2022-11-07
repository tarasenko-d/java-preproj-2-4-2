package jm.security.example.dao;

import jm.security.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User getUserByName(String name);

}
