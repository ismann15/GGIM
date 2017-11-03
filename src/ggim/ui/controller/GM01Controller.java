/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class GM01Controller implements Initializable{
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
        
        tcolumId.setCellFactory(new PropertyValueFactory <>("ID"));
        tcolumMaq.setCellFactory(new PropertyValueFactory <>("Maquina"));
        tcolumRev.setCellFactory(new PropertyValueFactory <>("Revision"));
        tcolumEst.setCellFactory(new PropertyValueFactory <>("Estado"));
        
        ObservableList<IncidenciaBean> incidencias=FXCollections.observableArrayList(man.getAllIncidencias());
        tablaIncidencias.setItems(incidencias);
    }
    public void initStage(Parent root) {
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnShowing(this::handleWindowShowing);
        stage.show();
    }
    
    
}
