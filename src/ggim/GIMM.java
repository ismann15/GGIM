/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim;

import ggim.ui.controller.GI01Controller;
import ggim.ui.controller.IncidenciasManager;
import ggim.ui.controller.IncidenciasManagerTestGenerator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author ubuntu
 */
public class GIMM extends Application {
    @Override
    public void start(Stage stage) throws Exception { 
        IncidenciasManager man= new IncidenciasManagerTestGenerator();
        /*FXMLLoader loader= new FXMLLoader(
                    getClass().getResource("/ggim/ui/view/L01.fxml"));*/
        FXMLLoader loader= new FXMLLoader(
                    getClass().getResource("/ggim/ui/view/GI01.fxml"));
        Parent root= (Parent)loader.load();
        GI01Controller controller= ((GI01Controller)loader.getController());
        controller.setStage(stage);
        controller.setManager(man);
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
