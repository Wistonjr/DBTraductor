package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFeedBackRepository extends JpaRepository<FeedBack, Integer> {
}
