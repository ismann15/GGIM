/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import java.util.Collection;
import javafx.collections.ObservableList;

/**
 *
 * @author ubuntu
 */
public interface IncidenciasManager {
    public Collection getAllIncidencias();
    public Collection getAllMaquinas();
    public Collection getAllEstados();
    public Collection getFiltradasFecha(String fecha,ObservableList<IncidenciaBean> filtro);
    public Collection getFiltradasMaquinas(String maquina,ObservableList<IncidenciaBean> filtro);
    public Collection getFiltradasEstados(String estado,ObservableList<IncidenciaBean> filtro);
    public Collection getFiltradasID(Integer id,ObservableList<IncidenciaBean> filtro);
}
