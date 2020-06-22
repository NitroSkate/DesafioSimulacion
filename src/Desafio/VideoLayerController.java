/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Joshua Sharp
 */
public class VideoLayerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button play;
    
    @FXML
    private MediaView mv;
    
    public static MediaPlayer mediaplayer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String mediaURL = getClass().getResource("/media/feeling.mp4").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(1.0);
        mediaplayer.setAutoPlay(true);
    }

    @FXML
    private void onClick(){
        if(mediaplayer.getStatus()==PLAYING){
            mediaplayer.stop();
        } else{
        mediaplayer.play();
        }
    }
    
}
