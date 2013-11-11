package es.rafalop.dao;

import es.rafalop.entity.User;
import java.util.List;

public interface UserDao extends AbstractDao<User, String> {
    void saveUser(User user);
    List<User> findUsers(String userName);
}
