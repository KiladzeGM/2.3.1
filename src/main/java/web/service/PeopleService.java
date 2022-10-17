package web.service;

import web.model.User;

import java.util.List;

public interface PeopleService {

    List<User> show();

    User userShow(int id);

    void save(User user);

    void update(User newUser);

    void delete(int id);

}
