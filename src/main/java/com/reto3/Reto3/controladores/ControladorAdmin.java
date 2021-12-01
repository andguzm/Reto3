/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Admin;
import com.reto3.Reto3.servicios.AdminServicio;
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
public class ControladorAdmin {
    
    @Autowired
    AdminServicio adminServicio;
    
    @GetMapping("/Admin/all")
    public List<Admin> all() {
        return adminServicio.BuscarTotal();
    }
    
    @GetMapping("/Admin/{id}")
    public Admin getId(@PathVariable("id") Integer id) {
        return (Admin) adminServicio.BuscarId(id);
    }
    
    
    @PostMapping("/Admin/save")
        public ResponseEntity post(@RequestBody Admin AdminSave) {
        adminServicio.guardarAdmin(AdminSave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Admin/update")
        public ResponseEntity put(@RequestBody Admin AdminUpdate) {
        adminServicio.guardarAdmin(AdminUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Admin/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        adminServicio.eliminarAdmin(id);
        return ResponseEntity.status(204).build();
    }
    
}

