package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.App;

import java.util.List;

public interface IAppService {

    public List<App> list();
    public void insert (App a);
    public App searchId (int id);
    public void update (App a);
    public void delete (int id);
}
