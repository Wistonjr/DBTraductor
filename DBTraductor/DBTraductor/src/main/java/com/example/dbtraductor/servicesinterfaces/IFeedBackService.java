package com.example.dbtraductor.servicesinterfaces;
import com.example.dbtraductor.entities.FeedBack;

import java.util.List;

public interface IFeedBackService {
    public List<FeedBack> list();
    public void insert (FeedBack a);
    public FeedBack searchId(int id);
    public void update (FeedBack a);
    public void delete (int id);
}
