package ru.kpfu.itits.pixel_battle.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/markup/intro.fxml"));
            primaryStage.setTitle("Pixel Battle");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

            primaryStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Throwable {
        AppClient appClient = new AppClient();
        launch(args);
    }
}
