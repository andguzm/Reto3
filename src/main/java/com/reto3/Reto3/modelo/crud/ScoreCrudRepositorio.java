/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.modelo.crud;

import com.reto3.Reto3.modelo.entidades.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Andrea Guzman
 */
@Repository
public interface ScoreCrudRepositorio extends CrudRepository<Score, Integer> {
    public Score findAllByid(Integer id);
}
