package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedBackRepository extends JpaRepository<FeedBack, Integer> {
}
