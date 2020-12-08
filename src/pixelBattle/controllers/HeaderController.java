package pixelBattle.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pixelBattle.Main;
import pixelBattle.exceptions.ClientException;

import java.io.IOException;

public class HeaderController {
    @FXML
    public static void options(MouseEvent event) throws ClientException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("markup/menu.fxml"));
        try {
            Parent mainLayout = loader.load();
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Stage stage = new Stage();
            Scene scene = new Scene(mainLayout);
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(appStage);
            stage.show();
        } catch (IOException e) {
            throw new ClientException(e);
        }
    }
}
