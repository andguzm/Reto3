/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.modelo.crud;

import com.reto3.Reto3.modelo.entidades.Lib;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea Guzman
 */
@Repository
public interface LibraryCrudRepositorio extends CrudRepository<Lib, Integer> {
    public List<Lib> findAllByname(String name);
    public Lib findAllByid(Integer id);
}
