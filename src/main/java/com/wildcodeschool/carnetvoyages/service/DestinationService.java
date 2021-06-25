package com.wildcodeschool.carnetvoyages.service;

import com.wildcodeschool.carnetvoyages.entity.Destination;
import com.wildcodeschool.carnetvoyages.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> findAll() { return destinationRepository.findAll(); }

    public Optional<Destination> findById(Long id) { return destinationRepository.findById(id); }

    public void save(Destination destination) { destinationRepository.save(destination); }

}