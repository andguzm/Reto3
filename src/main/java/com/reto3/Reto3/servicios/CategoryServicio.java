/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.CategoryCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class CategoryServicio {
    @Autowired
    CategoryCrudRepositorio CategoryRepo;
    
    public void guardarCategory(Category objetoCategory){
        CategoryRepo.save(objetoCategory);
    }
    
    public List<Category> BuscarTotal(){
        return (List<Category>)CategoryRepo.findAll();
    }
    
    public Category BuscarId(Integer id){
        return CategoryRepo.findAllByid(id).orElse(null);
    }
    
       public void eliminarCategory(Integer id){
        CategoryRepo.deleteById(id);
    }
}
