package Desafio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joshua Sharp
 */
public class ExitController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private MediaView mp3;
    
    MediaPlayer mediaplayer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        String mediaURL = getClass().getResource("/media/exit.mp3").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        mp3.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(0.45);
        mediaplayer.setAutoPlay(true);
        mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
    }    
    
        @FXML
    private void exitScene(ActionEvent event){
        final Node window = (Node) event.getSource();
        final Stage stage = (Stage) window.getScene().getWindow();
        stage.close();
    }
    
}
