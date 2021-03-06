package com.wildcodeschool.carnetvoyages.repository;

import com.wildcodeschool.carnetvoyages.entity.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {
}
