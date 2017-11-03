/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ubuntu
 */
public class IncidenciaBean {
     private final SimpleIntegerProperty id;
     private final SimpleStringProperty maquina;
     private final SimpleStringProperty fecha;
     private final SimpleStringProperty estado;

    public IncidenciaBean(Integer id, String maquina, String fecha, String estado) {
        this.id = new SimpleIntegerProperty(id);
        this.maquina= new SimpleStringProperty(maquina);
        this.estado= new SimpleStringProperty(estado);
        this.fecha= new SimpleStringProperty(fecha);
    }

    public Integer getId() {
        return this.id.get();
    }

    public String  getMaquina() {
        return this.maquina.get();
    }

    public String getFecha() {
        return this.fecha.get();
    }

    public String getEstado() {
        return this.estado.get();
    }
    
    public void setId(Integer id){
       this.id.set(id);
    }
    
    public void setMaquina(String maquina){
        this.maquina.set(maquina);
    }
    
    public void setFecha(String fecha){
        this.fecha.set(fecha);
    }
    
    public void setEstado(String estado){
        this.estado.set(estado);
    }
    
    
    
    
    
    
    
     
    
    
}
