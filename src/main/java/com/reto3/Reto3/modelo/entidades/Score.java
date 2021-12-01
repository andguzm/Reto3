/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.Reto3.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Andrea Guzman
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE , generator="secScore")
    @SequenceGenerator(name="secScore",sequenceName="DB_SEQUENCIA7", allocationSize=1)
    @Column(unique=true)
    private Integer id;
    @Column(length =250)
    private String text;
    @Temporal(TemporalType.DATE)
    private Date stars;
    @Temporal(TemporalType.DATE)
    private Date date;
    
    //relacion
    @OneToMany ( mappedBy = "score" , cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"lib","message","client","score"})
    private List<Reservation> reservations;

   
    
    public Score orElse(Object object) {
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
        if (!(object instanceof Score)) {
            return false;
        }
        Score other = (Score) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.reto3.Reto3.modelo.entidades.Score[ id=" + id + " ]";
    }
    
}
