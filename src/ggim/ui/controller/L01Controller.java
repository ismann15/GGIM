/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.ui.controller;

import ggim.control.GestionUsuariosTest;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class L01Controller implements Initializable {
    Logger logger;
    private Stage stage;
    @FXML
    private Button btEntrar;
    @FXML
    private TextField txtUsu;
    @FXML
    private PasswordField txtPass;
    
    
    @FXML
    private void handleWindowShowing(Event e){
        //Todos los campos se habilitan en la creación de la ventana
        btEntrar.setDisable(false);
        txtPass.setEditable(true);
        txtUsu.setEditable(true);
        
    }
    public void handleButtonClick(Event e){
        //se comprueban que los campos “texto Usuario” y “texto Contraseña” 
        //estén rellenados
        String u=txtUsu.getText().trim();
        String p=txtPass.getText().trim();
        boolean ok=false;
        if(u.isEmpty()||p.isEmpty()){
            Alert a= new Alert(Alert.AlertType.ERROR,"Error, los campos estan vacios",ButtonType.OK);
            a.show();
        }else{
            ok=comprobarDatos();
            
        }
        if(ok){
           ok=isAdmin();
        }else{
            //Si no son correctos, abre un diálogo de aviso que 
            //informa de que los datos introducidos no se 
            //corresponden con ningún usuario existente actualmente 
            //y se limpiaran los campos
             Alert a= new Alert(Alert.AlertType.ERROR,"Error, los campos no coinciden",ButtonType.OK);
             a.show();
             txtUsu.setText("");
             txtPass.setText("");
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void initStage(Parent root) {
        //logger.info("Inicizlizando Login");
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnShowing(this::handleWindowShowing);
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage=stage;
    }
    
    public Stage getStage(){
        return this.stage;
    }

    private boolean comprobarDatos() {
        GestionUsuariosTest t= new GestionUsuariosTest();
        boolean ok=t.existUser(txtUsu.getText().toString(), txtPass.getText().toString());
        return ok;
    }

    private boolean isAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
