/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class GI01Controller implements Initializable{
    private Stage stage;
    private IncidenciasManager man;
    @FXML
    private TableView tablaIncidencias;
    @FXML
    private TableColumn tcolumId;
    @FXML
    private TableColumn tcolumMaq;
    @FXML
    private TableColumn tcolumRev;
    @FXML
    private TableColumn tcolumEst;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnAniadir;
    @FXML
    private Button btnVolver;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnFiltrar;
    @FXML
    private ComboBox comboMaquinas;
    @FXML
    private ComboBox comboEstados;
    
    
    public void setStage(Stage stage){
        this.stage=stage;
    }
    
    public void setManager(IncidenciasManager man){
        this.man= man;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public void handleWindowShowing(Event e){
        //La tabla se rellena con los datos de las incidencias sin resolver 
        //(ya sea que estén sin comprobar o que estén en proceso de reparación), mostrando
        //primero aquellas mas antiguas
        tcolumId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcolumMaq.setCellValueFactory(new PropertyValueFactory<>("maquina"));
        tcolumRev.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        tcolumEst.setCellValueFactory(new PropertyValueFactory<>("estado"));
        ObservableList<IncidenciaBean> incidencias=FXCollections.observableArrayList(man.getAllIncidencias());
        tablaIncidencias.setItems(incidencias);
        tablaIncidencias.getSelectionModel().selectedItemProperty().addListener(this::handleIncidenciasTableSelectionChange);
        //Todos los controles están activos, exceptuando el “botón filtrar”, el “botón Limpiar” y el “botón modificar”
        btnEliminar.setDisable(true);
        btnAniadir.setDisable(true);
        btnModificar.setDisable(true);
        btnFiltrar.setDisable(true);
        btnLimpiar.setDisable(true);
        //El “comboBox Máquina” se carga con todas las máquinas existentes
        AniadirMaquinas();
        //El “comboBox Estado” se carga con todos los posibles 
        //estados de una incidencia (Resuelta, En proceso, Sin procesar)
        AniadirEstados();
    }
    public void initStage(Parent root) {
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnShowing(this::handleWindowShowing);
        stage.show();
        
    }
    
    public void handleIncidenciasTableSelectionChange(ObservableValue observable, Object oldValue, Object newValue){
    //Se resalta la fila seleccionada, y se habilita el “botón Modificar”
        if(newValue!=null){
            btnEliminar.setDisable(false);
            btnAniadir.setDisable(false);
            btnModificar.setDisable(false);
        }
    }

    private void AniadirMaquinas() {
        //El “comboBox Máquina” se carga con todas las máquinas existentes
        ObservableList <String> maquinas= FXCollections.observableArrayList(man.getAllMaquinas());
        comboMaquinas.setItems(maquinas);
    }

    private void AniadirEstados() {
        //El “comboBox Estado” se carga con todos los posibles estados 
        //de una incidencia (Resuelta, En proceso, Sin procesar)
        ObservableList <String> maquinas= FXCollections.observableArrayList(man.getAllEstados());
        comboEstados.setItems(maquinas);
    }
   
    
}
