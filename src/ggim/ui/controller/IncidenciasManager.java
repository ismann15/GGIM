/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import java.util.Collection;

/**
 *
 * @author ubuntu
 */
public interface IncidenciasManager {
    public Collection getAllIncidencias();
    public Collection getAllMaquinas();
    public Collection getAllEstados();
    public Collection getFiltradasFecha();
    public Collection getFiltradasMaquinas();
    public Collection getFiltradasEstados();
    public Collection getFiltradasID();
}
