package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAppRepository extends JpaRepository<App, Integer> {

}
