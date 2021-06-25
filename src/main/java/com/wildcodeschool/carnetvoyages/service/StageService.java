package com.wildcodeschool.carnetvoyages.service;

import com.wildcodeschool.carnetvoyages.entity.Stage;
import com.wildcodeschool.carnetvoyages.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;

    public Optional<Stage> findById(Long id) { return stageRepository.findById(id);}


}
