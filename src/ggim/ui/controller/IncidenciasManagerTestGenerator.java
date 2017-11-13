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
        return maquinas;
    }
    public IncidenciasManagerTestGenerator(){
        //Añadir maquinas
        maquinas= new ArrayList<String>();
        maquinas.add("Sin selección");
        for(int i=0;i<25;i++){
            maquinas.add("maquina"+i);
        }
        //Añadr estados
        estados= new ArrayList <String>();
        estados.add("Sin selección");
        estados.add("Resuelta");
        estados.add("En proceso");
        estados.add("Sin procesar");
        //Añadir datos a la tabla
        incidencias= new ArrayList <IncidenciaBean>();
        for(int i=0;i<25;i++){
            int x= (int)(Math.random()*3)+1;
            incidencias.add(new IncidenciaBean(i,maquinas.get(i+1),i+"/"+i+"/"+i,estados.get(x)));
        }
    }

    @Override
    public Collection getAllEstados() {
        return estados;
    }

    @Override
    public Collection getFiltradasFecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection getFiltradasMaquinas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection getFiltradasEstados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection getFiltradasID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
