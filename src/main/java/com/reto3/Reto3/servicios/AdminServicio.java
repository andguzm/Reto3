/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.AdminCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Admin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class AdminServicio {
    @Autowired
    AdminCrudRepositorio AdminRepo;
    
    public void guardarAdmin(Admin objetoAdmin){
        AdminRepo.save(objetoAdmin);
    }
    
    public List<Admin> BuscarTotal(){
        return (List<Admin>) AdminRepo.findAll();
    }
    
    public Admin BuscarId(Integer id){
        return AdminRepo.findAllByid(id).orElse(null);
    }
    
    public void eliminarAdmin(Integer id){
        AdminRepo.deleteById(id);
    }
}

