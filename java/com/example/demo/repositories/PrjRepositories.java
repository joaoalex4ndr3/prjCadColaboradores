package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.PrjEntities;

public interface PrjRepositories extends JpaRepository<PrjEntities, Long> {

}
