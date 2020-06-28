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
import javafx.scene.image.Image;
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
public class CompWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane pane;
    
    @FXML
    private MediaView mp3;
    
    MediaPlayer mediaplayer;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String mediaURL = getClass().getResource("/media/comp.mp3").toExternalForm();
        Media media = new Media(mediaURL);
        mediaplayer = new MediaPlayer(media);
        mp3.setMediaPlayer(mediaplayer);
        mediaplayer.setVolume(0.45);
        mediaplayer.setAutoPlay(true);
        mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
    }
     
    
    @FXML
    private void executeA(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("A.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void executeB(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("B.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void executeC(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("C.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void executeD(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("D.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void executeV(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("V.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void executeW(ActionEvent e) throws IOException {
        BorderPane container = FXMLLoader.load(getClass().getResource("W.fxml"));
        pane.setCenter(container);
    }
    
    @FXML
    private void onClose(ActionEvent event) throws IOException {
        mediaplayer.stop();
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