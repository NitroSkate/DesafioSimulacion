/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Sharp
 */
public class Window1Controller implements Initializable {
    
    @FXML
    private MediaView math;
    
    MediaPlayer mediaplayer;
    
   
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //System.out.println(document.getDocumentBase());
        //Media media = new Media(new File("src/media/space.mp3").toURI().toString());
        String mediaURL = getClass().getResource("/media/space.mp3").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        math.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(0.2);
        mediaplayer.setAutoPlay(true);
        mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        mediaplayer.dispose();
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Window2.fxml"));
        Parent root = loader.load();
        
        Stage stage2  = new Stage();
        stage2.getIcons().add(new Image("media/icon.jpg"));
        stage2.setScene(new Scene(root, 986, 717));
        stage2.setResizable(false);
        stage2.setTitle("Menu");
        stage2.show();
        
        
    }
    
    @FXML
    private void exitScene(ActionEvent event){
        final Node window = (Node) event.getSource();
        final Stage stage = (Stage) window.getScene().getWindow();
        stage.close();
    }
    
   
    
}
