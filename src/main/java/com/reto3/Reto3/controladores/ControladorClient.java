/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Client;
import com.reto3.Reto3.servicios.ClientServicio;
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
public class ControladorClient {
    
    @Autowired
    ClientServicio clientServicio;
    
    @GetMapping("/Client/all")
    public List<Client> all() {
        return clientServicio.BuscarTotal();
    }
    
    @GetMapping("/Client/{id}")
    public Client getId(@PathVariable("id") Integer id) {
        return clientServicio.BuscarId(id);
    }
    
    
    @PostMapping("/Client/save")
        public ResponseEntity post(@RequestBody Client clientSave) {
        clientServicio.guardarClient(clientSave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Client/update")
        public ResponseEntity put(@RequestBody Client clientUpdate) {
        clientServicio.guardarClient(clientUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Client/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        clientServicio.eliminarClient(id);
        return ResponseEntity.status(204).build();
    }
    
    
    
    
}
