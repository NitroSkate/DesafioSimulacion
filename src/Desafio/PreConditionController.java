/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joshua Sharp
 */
public class PreConditionController implements Initializable {

   /**
     * Initializes the controller class.
     */
    
    MediaPlayer mp = Window2Controller.mediaplayer;
    
    //private Window2Controller control;
    
    @FXML
    private BorderPane pane;
    
    @FXML
    private void onNext(ActionEvent e) throws IOException{
        
        mp.dispose();
        
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Condition.fxml"));
        Parent root = loader.load();
        
        Stage stage2  = new Stage();
        stage2.getIcons().add(new Image("media/icon.jpg"));
        stage2.setScene(new Scene(root, 1000, 717));
        stage2.setResizable(false);
        stage2.setTitle("Condiciones de Contorno");
        stage2.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }  
}
