package pixelBattle;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import pixelBattle.controllers.MapController;
import pixelBattle.model.Player;

import java.io.IOException;

public class Main extends Application {
//    private static Player player = new Player();
//    private Stage stage;
//
//    public void initInput(){
//
//
//        stage.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
//            if (ev.getCode() == KeyCode.W) {
//                if(player.getTank() != null){
//                    player.getTank().moveTank();
//                }
//            }
//        });
//
//        stage.addEventHandler(KeyEvent.KEY_RELEASED, ev -> {
//            if (ev.getCode() == KeyCode.W) {
//                if(player.getTank() != null){
//                    System.out.println(1);
//                    player.getTank().stopTank();
//                }
//            }
//        });
//    }
//
//    public static Player getPlayer(){
//        return player;
//    }

    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("markup/intro.fxml"));
//            this.stage = primaryStage;

            primaryStage.setTitle("Pixel Battle");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

//            initInput();
            primaryStage.show();
        } catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
