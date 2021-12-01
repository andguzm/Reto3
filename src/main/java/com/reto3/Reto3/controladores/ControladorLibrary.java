/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.controladores;

import com.reto3.Reto3.modelo.entidades.Lib;
import com.reto3.Reto3.servicios.LibraryServicio;
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
public class ControladorLibrary {
    
    @Autowired
    LibraryServicio libraryServicio;
    
    @GetMapping("/Lib/all")
    public List<Lib> all() {
        return libraryServicio.BuscarTotal();
    }
    
    @GetMapping("/Lib/{id}")
    public Lib getId(@PathVariable("id") Integer id) {
        return (Lib) libraryServicio.BuscarId(id);
    }
    
    @PostMapping("/Lib/save")
        public ResponseEntity post(@RequestBody Lib librarySave) {
        libraryServicio.guardarLibrary(librarySave);
        return ResponseEntity.status(201).build();
    }
    
  
    @PutMapping("/Lib/update")
        public ResponseEntity put(@RequestBody Lib libraryUpdate) {
        libraryServicio.guardarLibrary(libraryUpdate);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/Lib/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer id) {
        libraryServicio.eliminarLibrary(id);
        return ResponseEntity.status(204).build();
    }
    
}
