package com.wildcodeschool.carnetvoyages.service;

import com.wildcodeschool.carnetvoyages.entity.Destination;
import com.wildcodeschool.carnetvoyages.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> findAllDestinations()
    {
        return destinationRepository.findAll();
    }

    public void save(Destination destination)
    {
        destinationRepository.save(destination);
    }

    public void remove(Long idDestination)
    {
        destinationRepository.deleteById(idDestination);
    }
}
