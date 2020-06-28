/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Sharp
 */
public class MainWindow extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Window1.fxml"));
        
        Scene scene = new Scene(root, 999, 707);
        stage.getIcons().add(new Image("media/icon.jpg"));
        stage.setTitle("Metodo de los Elementos Finitos en 3D");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
       /* stage.setOnCloseRequest(event -> {
            Parent exit = null;
            try {
                exit = FXMLLoader.load(getClass().getResource("Window2.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
  
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(exit, 989, 717));
            stage2.setResizable(false);
            stage2.show();
        
        });*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
