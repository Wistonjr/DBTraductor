package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Users;
import com.example.dbtraductor.repositories.ITraduccionRepository;
import com.example.dbtraductor.repositories.IUserRepository;
import com.example.dbtraductor.servicesinterfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImplement  implements IUsersService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<Users> list() {
            return uR.findAll();
    }

    @Override
    public void insert(Users u) {
        uR.save(u);
    }

    @Override
    public Users searchId(long id) {
        return uR.findById(id).orElse(new Users());
    }


    @Override
    public void update(Users u) {
    uR.save(u);
    }

    @Override
    public void delete(long id) {
    uR.deleteById(id);
    }
}
