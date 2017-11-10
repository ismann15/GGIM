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
    ArrayList <String> maquinas;
    ArrayList <String> estados;
    @Override
    public Collection getAllIncidencias() {
        return incidencias;
    }
    
    public Collection getAllMaquinas(){
        maquinas= new ArrayList<String>();
        maquinas.add("Sin selección");
        for(int i=0;i<incidencias.size();i++){
            maquinas.add(incidencias.get(i).getMaquina());
        }
        return maquinas;
        
    }
    public IncidenciasManagerTestGenerator(){
        incidencias= new ArrayList <IncidenciaBean>();
        for(int i=0;i<25;i++){
            incidencias.add(new IncidenciaBean(i,"maquina"+i,"estado"+i,i+"/"+i+"/"+i));
        }
    }

    @Override
    public Collection getAllEstados() {
        estados= new ArrayList <String>();
        estados.add("Sin selección");
        estados.add("Resuelta");
        estados.add("En proceso");
        estados.add("Sin procesar");
        return estados;
    }
}
