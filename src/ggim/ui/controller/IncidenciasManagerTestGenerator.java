/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;


import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ubuntu
 */
public class IncidenciasManagerTestGenerator implements IncidenciasManager{
    ArrayList <IncidenciaBean> incidencias;
    @Override
    public Collection getAllIncidencias() {
        return incidencias;
    }
    
    public ArrayList <IncidenciaBean> IncidenciasGenerator(){
        incidencias= new ArrayList <IncidenciaBean>();
        for(int i=0;i<25;i++){
            incidencias.add(new IncidenciaBean(i,"maquina"+1,"estado"+1,i+"/"+i+"/"+i));
        }
        return incidencias;
    }
}
