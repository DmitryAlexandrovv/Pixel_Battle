package pixelBattle.controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Menu {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void exit(MouseEvent e){
        System.exit(0);
    }
}
