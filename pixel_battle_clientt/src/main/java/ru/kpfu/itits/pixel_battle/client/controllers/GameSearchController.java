package ru.kpfu.itits.pixel_battle.client.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ru.kpfu.itits.pixel_battle.client.exceptions.ClientException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import ru.kpfu.itits.pixel_battle.client.Main;

public class GameSearchController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label gameSearchLabel;

    @FXML
    private Label gameSearchTimer;

    @FXML
    private Button backButton;

    @FXML
    private void options(MouseEvent event) throws ClientException {
        HeaderController.options(event);
    }

    @FXML
    public void goBack(MouseEvent event) throws ClientException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/markup/intro.fxml"));
        try {
            Parent mainLayout = loader.load();
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.getScene().setRoot(mainLayout);
        } catch (IOException e) {
            throw new ClientException(e);
        }
    }

    @FXML
    void initialize() {
        assert gameSearchLabel != null : "fx:id=\"gameSearchLabel\" was not injected: check your FXML file 'gameSearch.fxml'.";
        assert gameSearchTimer != null : "fx:id=\"gameSearchTimer\" was not injected: check your FXML file 'gameSearch.fxml'.";

        final int[] seconds = {0};
        final int[] minutes = {0};
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/markup/map.fxml"));
        Timeline timeline = new Timeline (
                new KeyFrame(
                        Duration.millis(1000),
                        ae -> {
                            if(seconds[0] == 2){
                                try {
                                    Parent mainLayout = loader.load();
                                    Stage appStage = (Stage) gameSearchLabel.getScene().getWindow();
                                    appStage.getScene().setRoot(mainLayout);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            if(seconds[0] < 10){
                                gameSearchTimer.setText(minutes[0] + ":0" + seconds[0]);
                            } else if(seconds[0] > 60){
                                minutes[0]++;
                                seconds[0] = 0;
                                gameSearchTimer.setText(minutes[0] + ":0" + seconds[0]);
                            } else {
                                gameSearchTimer.setText(minutes[0] + ":" + seconds[0]);
                            }
                            seconds[0]++;
                        }
                )
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
