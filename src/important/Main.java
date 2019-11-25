package important;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    /**
     *  - NO GRAPHICAL USER INTERFACE IS REQUIRED
     *  - https://cardgames.io/yahtzee/
     *  - You only have to check for Ones, Twos, Threes, Fours, Fives and Sixes.
     *  - Checking for a Three of a kind, Four of a kind, Full house, a Small Straight, a Large Straight and Chance are optional!
     *  - Completing these optional checks will guarantee a leaderboard point if the program works as intended.
     *  - Sum and bonus are not required.
     *  - You need to show the total points after the game is played.
     *  - It is optional to have both a one-player and two-player system, but it is required to have one of the two.
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/files/intro.fxml"));
        primaryStage.setTitle("Welcome to Yahtzee!");
        primaryStage.setScene(new Scene(root,350,195));
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
