/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Message;
import com.reto3.Reto3.servicios.MessageServicio;
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
public class ControladorMessage {
    
    @Autowired
    MessageServicio messageServicio; 
    
    @GetMapping("/Message/all")
    public List<Message> all() {
        return messageServicio.BuscarTotal();
    }
    
    @GetMapping("/Message/{id}")
    public Message getId(@PathVariable("idMessage") Integer id) {
        return (Message) messageServicio.BuscarId(id);
    }
    
    
    @PostMapping("/Message/save")
        public ResponseEntity post(@RequestBody Message messageSave) {
        messageServicio.guardarMessage(messageSave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Message/update")
        public ResponseEntity put(@RequestBody Message messageUpdate) {
        messageServicio.guardarMessage(messageUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Message/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        messageServicio.eliminarMessage(id);
        return ResponseEntity.status(204).build();
    }
    
}
