/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.ScoreCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Score;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Andrea Guzman
 */
@Service
public class ScoreServicio {
    @Autowired 
    ScoreCrudRepositorio ScoreRepo;
    
    public void guardarScore (Score objetoScore){
        ScoreRepo.save( objetoScore);
    }
    
    public List<Score> BuscarTotal(){
        return (List<Score>) ScoreRepo.findAll();
    }
       
    public Score BuscarId(Integer id){
        return ScoreRepo.findAllByid(id).orElse("None");
    }
    
     public void eliminarScore(Integer id){
        ScoreRepo.deleteById(id);
    }
    
}
