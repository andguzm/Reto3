/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Andrea Guzman
 * @Fecha:28/Nov/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libs")
/**
 *
 *Cambio del nombre de la tabla 
 */
public class Lib implements Serializable {
/**
 *
 *ID Autoincrementable 
 */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE , generator="secLib")
    @SequenceGenerator(name="secLib",sequenceName="DB_SEQUENCIA4", allocationSize=1)
    @Column(unique=true)
    private Integer id;
/**
 *
 *Cambio de longitud de caracteres
 */
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String target;
    private Integer capacity;
    @Column(length = 250)
    private String description;
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
    
/**
 *
 *Conexion a la tabla de Categoria 
 */
    //relacion
    
    @OneToMany ( mappedBy = "lib" , cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"lib","client"})
    private List<Message> messages;
    
    @OneToMany ( mappedBy = "lib" , cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"lib","message","client","score"})
    private List<Reservation> reservations;


 //Validacion de no encontrar el dato

    public Lib orElse(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lib)) {
            return false;
        }
        Lib other = (Lib) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.reto3.Reto3.modelo.entidades.Library[ id=" + id + " ]";
    }

}
