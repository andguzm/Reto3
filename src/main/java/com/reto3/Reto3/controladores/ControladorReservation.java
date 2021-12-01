/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Reservation;
import com.reto3.Reto3.servicios.ReservationServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


/**
 *
 * @author Andrea Guzman
 */
@RestController
@RequestMapping("/api")
public class ControladorReservation {
    
    @Autowired
    ReservationServicio reservationServicio;
    
    
    @GetMapping("/Reservation/all")
    public List<Reservation> all() {
        return reservationServicio.BuscarTotal();
    }
    
    @GetMapping("/Reservation/{id}")
    public Reservation getId(@PathVariable("idReservation") Integer id) {
        return reservationServicio.BuscarId(id);
    }
    
    
    @PostMapping("/Reservation/save")
        public ResponseEntity post(@RequestBody Reservation reservationSave) {
        reservationServicio.guardarReservation(reservationSave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Reservation/update")
        public ResponseEntity put(@RequestBody Reservation reservationUpdate) {
        reservationServicio.guardarReservation(reservationUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Reservation/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        reservationServicio.eliminarReservation(id);
        return ResponseEntity.status(204).build();
    }
    
}
