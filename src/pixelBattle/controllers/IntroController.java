package pixelBattle.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.security.ntlm.Client;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pixelBattle.Main;
import pixelBattle.exceptions.ClientException;
import pixelBattle.model.Player;

public class IntroController {

       @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button toBattleButton;

    @FXML
    private Button exitMenuButton;

    @FXML
    private Button optionsMenuButton;

    @FXML
    private FlowPane optionsPane;

    @FXML
    private void options(MouseEvent event) throws ClientException {
        HeaderController.options(event);
    }

    @FXML
    private void toBattle(MouseEvent event) throws ClientException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("markup/gameSearch.fxml"));
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
    }
}