/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import javafx.collections.ObservableList;

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
            incidencias.add(new IncidenciaBean(i,maquinas.get(i+1),i+"/11/2018",estados.get(x)));
        }
        incidencias.add(new IncidenciaBean(14,maquinas.get(14+1),14+"/11/2018",estados.get(2)));
    }

    @Override
    public Collection<String> getAllEstados() {
        return estados;
    }

    @Override
    public Collection<IncidenciaBean> getFiltradasFecha(String fecha,ObservableList<IncidenciaBean> filtro) {
        Collection<IncidenciaBean> coll=null;
        coll=filtro.stream().filter(i->i.getFecha().equals(fecha)).collect(Collectors.toList());
        return coll;
    }

    @Override
    public Collection<IncidenciaBean> getFiltradasMaquinas(String maquina,ObservableList<IncidenciaBean> filtro) {
        Collection<IncidenciaBean> coll=null;
        coll=filtro.stream().filter(i->i.getMaquina().equals(maquina)).collect(Collectors.toList());
        return coll;
    }

    @Override
    public Collection<IncidenciaBean> getFiltradasEstados(String estado,ObservableList<IncidenciaBean> filtro) {
        Collection<IncidenciaBean> coll=null;
        coll=filtro.stream().filter(i->i.getEstado().equals(estado)).collect(Collectors.toList());
        return coll;
    }

    @Override
    public Collection<IncidenciaBean> getFiltradasID(Integer id,ObservableList<IncidenciaBean> filtro) {
        Collection<IncidenciaBean> coll=null;
        coll= filtro.stream().filter(i-> i.getId()==id).collect(Collectors.toList());
        return coll;
    }
}
