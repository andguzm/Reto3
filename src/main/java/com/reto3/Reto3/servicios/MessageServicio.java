/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.servicios;

import com.reto3.Reto3.modelo.crud.MessageCrudRepositorio;
import com.reto3.Reto3.modelo.entidades.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Guzman
 */
@Service
public class MessageServicio {
    @Autowired
    MessageCrudRepositorio MessageRepo;
    
    public void guardarMessage (Message objetoMessage){
        MessageRepo.save(objetoMessage);
    }
    
    public List<Message> BuscarTotal(){
        return (List<Message>) MessageRepo.findAll();
    }
    
    public Message BuscarId(Integer id){
        return MessageRepo.findAllByid(id).orElse(null);
    }
    
    public void eliminarMessage(Integer id){
        MessageRepo.deleteById(id);
    }
}
