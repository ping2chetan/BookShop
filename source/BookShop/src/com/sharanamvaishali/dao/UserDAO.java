package com.sharanamvaishali.dao;

import com.sharanamvaishali.model.User;
import java.util.List;

public interface UserDAO {
    public void saveUser(User User);
    public List<User> listUser();
    public void removeUser(Integer userNo);
    public User getUserById(Integer userNo);
    public User getUserByUserName(String userName);
}
