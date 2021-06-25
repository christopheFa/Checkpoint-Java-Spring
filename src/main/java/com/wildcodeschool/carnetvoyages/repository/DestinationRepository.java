package com.wildcodeschool.carnetvoyages.repository;

import com.wildcodeschool.carnetvoyages.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long>  {
}
