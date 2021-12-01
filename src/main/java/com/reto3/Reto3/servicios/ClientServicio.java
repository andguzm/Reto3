/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.ClientCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class ClientServicio {
    @Autowired 
    ClientCrudRepositorio ClientRepo;
    
    public void guardarClient (Client objetoClient){
        ClientRepo.save(objetoClient);
    }
    
    public List<Client> BuscarTotal(){
        return (List<Client>) ClientRepo.findAll();
    }
       
    public Client BuscarId(Integer id){
        return ClientRepo.findAllByid(id).orElse(null);
    }
    
       public void eliminarClient(Integer id){
        ClientRepo.deleteById(id);
    }
}

