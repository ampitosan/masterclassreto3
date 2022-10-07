package com.example.masterclassereto3.service;

import com.example.masterclassereto3.Repository.ReservasRepository;
import com.example.masterclassereto3.Repository.ScoreRepository;
import com.example.masterclassereto3.entities.Reservation;
import com.example.masterclassereto3.entities.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

        public List<Score> getAll(){
            return scoreRepository.getAll();
        }

        public Optional<Score> getScore(int id){
            return scoreRepository.getScore(id);
        }

        public Score save (Score score){
            if (score.getIdScore() == null){
                return scoreRepository.save(score);
            } else {
                Optional<Score> score1 = scoreRepository.getScore(score.getIdScore());
                if(score1.isEmpty()){
                    return scoreRepository.save(score);
                } else {
                    return score;
                }
            }
        }
    }


