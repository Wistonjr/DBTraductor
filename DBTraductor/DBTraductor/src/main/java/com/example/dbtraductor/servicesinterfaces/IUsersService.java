package com.example.dbtraductor.servicesinterfaces;


import com.example.dbtraductor.entities.Users;
import java.util.List;

public interface IUsersService {
    public List<Users> list();
    public void insert (Users u);
    public Users searchId(long id);
    public void update (Users u);
    public void delete (long  id);
}
