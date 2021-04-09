package com.javamaster44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {


    @FXML
    public void initialize(){

    }

    @FXML
    public void play(){
        Parent root = null;
        Stage primaryStage = new Stage();
        try { //open main menu
            root = FXMLLoader.load(getClass().getResource("Game.fxml"));
            primaryStage.setTitle("Battleship 2.0");
            primaryStage.setScene(new Scene(root, 590, 475));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void settings(){

        Parent root = null;
        Stage primaryStage = new Stage();
        try { //open main menu
            root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
            primaryStage.setTitle("Battleship 2.0");
            primaryStage.setScene(new Scene(root, 590, 475));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
