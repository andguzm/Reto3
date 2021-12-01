/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.LibraryCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Lib;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class LibraryServicio {
    @Autowired
    LibraryCrudRepositorio libraryRepo;
    
    public void guardarLibrary(Lib objetoLibrary){
        libraryRepo.save(objetoLibrary);
    }
    
    public List<Lib> BuscarTotal(){
        return (List<Lib>) libraryRepo.findAll();
    }
    
    public Lib BuscarId(Integer id){
        return libraryRepo.findAllByid(id).orElse(null);
    }
    
    public void eliminarLibrary(Integer id){
        libraryRepo.deleteById(id);
    }
}
