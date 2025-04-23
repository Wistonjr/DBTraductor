package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.FeedBack;
import com.example.dbtraductor.repositories.IFeedBackRepository;
import com.example.dbtraductor.servicesinterfaces.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedBackServiceImplement implements IFeedBackService {

    @Autowired
    private IFeedBackRepository re;

    @Override
    public List<FeedBack> list() {
        return re.findAll();
    }

    @Override
    public void insert(FeedBack a) {
        re.save(a);
    }

    @Override
    public FeedBack searchId(int id) {
        return re.findById(id).orElse(new FeedBack());
    }

    @Override
    public void update(FeedBack a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
