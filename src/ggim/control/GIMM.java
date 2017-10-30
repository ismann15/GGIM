/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.control;

import ggim.ui.controller.L01Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class GIMM extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
           FXMLLoader loader= new FXMLLoader(
                    getClass().getResource("ggim/ui/view/L01.fxml"));
           Parent root= (Parent)loader.load();
           L01Controller controller= ((L01Controller)loader.getController());
           controller.setStage(primaryStage);
           controller.initStage(root);
        
        //Scene scene = new Scene(root);
        
        //stage.setScene(scene);
        //stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
