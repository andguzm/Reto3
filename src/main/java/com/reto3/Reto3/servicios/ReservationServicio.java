/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.ReservationCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class ReservationServicio {
    @Autowired
    ReservationCrudRepositorio ReservationRepo;
    
    public void guardarReservation(Reservation objetoReservation){
        ReservationRepo.save(objetoReservation);
    }
    
    public List<Reservation> BuscarTotal(){
        return (List<Reservation>) ReservationRepo.findAll();
    }
    
    public Reservation BuscarId(Integer id){
        return ReservationRepo.findAllByid(id).orElse(null);
    }
    
     public void eliminarReservation(Integer id){
        ReservationRepo.deleteById(id);
    }
}

