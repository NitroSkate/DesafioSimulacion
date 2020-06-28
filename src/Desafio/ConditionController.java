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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
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
public class ConditionController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button play;
    
    @FXML
    private MediaView video;
    
    public static MediaPlayer mediaplayer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String mediaURL = getClass().getResource("/media/Condic.mp4").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        video.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(1.0);
    }

    @FXML
    private void onPlay(ActionEvent e){
        mediaplayer.play();
    }
    
    @FXML
    private void onStop(ActionEvent e){
        if(mediaplayer.getStatus()==PLAYING)
        mediaplayer.pause();
    }
    
    @FXML
    private void onRollBack(ActionEvent event) throws IOException{
        mediaplayer.dispose();
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Window2.fxml"));
        Parent root = loader.load();
        
        Stage stage2  = new Stage();
        stage2.getIcons().add(new Image("media/icon.jpg"));
        stage2.setScene(new Scene(root, 995, 717));
        stage2.setTitle("Menu");
        stage2.show();
    }
    
}
