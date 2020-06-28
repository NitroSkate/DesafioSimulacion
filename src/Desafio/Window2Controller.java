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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
    
    
    @FXML
    private void executeDomain(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Domain.fxml"));
        borderpane.setCenter(container);

    }
    
    @FXML
    private void executeMesh(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Mesh.fxml"));
        borderpane.setCenter(container);
   }
    
    @FXML
    private void executeTable(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Table.fxml"));
        borderpane.setCenter(container);

    }
    
        @FXML
    private void executeModel(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Model.fxml"));
        borderpane.setCenter(container);

    }
    
    @FXML
    private void executeVideo(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("Video.fxml"));
        borderpane.setCenter(container);

    }
    
    @FXML
    private void executeCondition(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("PreCondition.fxml"));
        borderpane.setCenter(container);

    }
    
    @FXML
    private void executeMEF(ActionEvent e) throws Exception {
        BorderPane container = FXMLLoader.load(getClass().getResource("MEF.fxml"));
        borderpane.setCenter(container);

        
    }
    
    @FXML
    private void executeComp(ActionEvent e) throws Exception {
        BorderPane container = FXMLLoader.load(getClass().getResource("Comp.fxml"));
        borderpane.setCenter(container);

        
    }
    
    @FXML
    private void executeExit(ActionEvent e) throws IOException{
        
        mediaplayer.dispose();
        
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Exit.fxml"));
        Parent root = loader.load();
        
        Stage stage2  = new Stage();
        stage2.getIcons().add(new Image("media/icon.jpg"));
        stage2.setScene(new Scene(root, 1000, 717));
        stage2.setResizable(false);
        stage2.setTitle("Goodbye");
        stage2.show();
        
    }
   

    
    
    
    
}
