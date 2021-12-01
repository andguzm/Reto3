/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Category;
import com.reto3.Reto3.modelo.entidades.Lib;
import com.reto3.Reto3.servicios.CategoryServicio;
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
public class ControladorCategory {
    
    @Autowired
    CategoryServicio categoryServicio;
    
    @GetMapping("/Category/all")
    public List<Category> all() {
        return categoryServicio.BuscarTotal();
    }
    
    @GetMapping("/Category/{id}")
    public Category getId(@PathVariable("id") Integer id) {
        return (Category) categoryServicio.BuscarId(id);
    }
    
    
    @PostMapping("/Category/save")
        public ResponseEntity post(@RequestBody Category categorySave) {
        categoryServicio.guardarCategory(categorySave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Category/update")
        public ResponseEntity put(@RequestBody Category categoryUpdate) {
        categoryServicio.guardarCategory(categoryUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Category/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        categoryServicio.eliminarCategory(id);
        return ResponseEntity.status(204).build();
    }
    
    
    
    
}
