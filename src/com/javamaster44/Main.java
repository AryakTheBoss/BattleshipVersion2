package com.javamaster44;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private final int WINDOWWIDTH = 590;
    private final int WINDOWHEIGHT = 475;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Parent root = null;
        try { //open main menu
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            primaryStage.setTitle("Battleship 2.0");
            primaryStage.setScene(new Scene(root, WINDOWWIDTH, WINDOWHEIGHT));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
