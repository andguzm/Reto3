/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.modelo.crud;

import com.reto3.Reto3.modelo.entidades.Client;
import com.reto3.Reto3.modelo.entidades.Lib;
import com.reto3.Reto3.modelo.entidades.Reservation;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea Guzman
 */
@Repository
public interface ReservationCrudRepositorio extends CrudRepository<Reservation, Integer> {
    public Reservation findAllByid(Integer id);
}
