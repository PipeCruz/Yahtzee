package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class IntroController extends ActionEvent {

    public void buttonClicked(MouseEvent m) throws IOException {
        System.out.println("clicked");
        Parent two = FXMLLoader.load(getClass().getResource("/files/afterIntro.fxml"));
        Scene sceneTwo = new Scene(two);
        Stage window = (Stage)((Node)m.getSource()).getScene().getWindow();
        window.setScene(sceneTwo);
        window.centerOnScreen();
        window.show();
        Stage gameStage = new Stage();
        gameStage.initStyle(StageStyle.DECORATED);
        gameStage.setTitle("Yahtzee");
        gameStage.setScene(sceneTwo);
        window.setScene(null);
        gameStage.setScene(sceneTwo);
        gameStage.show();
        gameStage.setResizable(false);
        window.hide();

    }

}
