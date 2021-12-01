/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Score;
import com.reto3.Reto3.servicios.ScoreServicio;
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
public class ControladorScore {
    
    @Autowired
    ScoreServicio scoreServicio;
    
    @GetMapping("/Score/all")
    public List<Score> all() {
        return scoreServicio.BuscarTotal();
    }
    
    @GetMapping("/Score/{id}")
    public Score getId(@PathVariable("id") Integer id) {
        return (Score) scoreServicio.BuscarId(id);
    }
    
  
    @PostMapping("/Score/save")
        public ResponseEntity post(@RequestBody Score scoreSave) {
        scoreServicio.guardarScore(scoreSave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Score/update")
        public ResponseEntity put(@RequestBody Score scoreUpdate) {
        scoreServicio.guardarScore(scoreUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Score/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        scoreServicio.eliminarScore(id);
        return ResponseEntity.status(204).build();
    }
    
    
}
