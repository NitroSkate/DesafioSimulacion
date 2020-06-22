/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joshua Sharp
 */
public class Window2Controller implements Initializable {

    /**
     * Initializes the controller class.
     *
     */
   
    
    MediaPlayer video = VideoLayerController.mediaplayer;
    
    @FXML
    private BorderPane borderpane;
    
    @FXML
    private MediaView mp3;
    
    
    
    public static MediaPlayer mediaplayer = null;
    

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String mediaURL = getClass().getResource("/media/jazz.mp3").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        mp3.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(0.5);
        mediaplayer.setAutoPlay(true);
        mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
    }
    
    public void verifyVideo(){
        if(video != null){
            video.dispose();
        } else{
            System.out.println("PTM es nulo");
        }
    }
    
    @FXML
    private void executeDomain(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Domain.fxml"));
        borderpane.setCenter(container);
        mediaplayer.play();
    }
    
        @FXML
    private void executeModel(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Model.fxml"));
        borderpane.setCenter(container);
        mediaplayer.play();
    }
    
    @FXML
    private void executeVideo(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("VideoLayer.fxml"));
        borderpane.setCenter(container);
        mediaplayer.play();
    }
    
    @FXML
    private void executeMEF(ActionEvent e) throws Exception {
        verifyVideo();
        BorderPane container = FXMLLoader.load(getClass().getResource("MEF.fxml"));
        borderpane.setCenter(container);
        //mediaplayer.pause();
        //setMedia(mediaplayer);
        
        
    }
   

    
    
    
    
}
