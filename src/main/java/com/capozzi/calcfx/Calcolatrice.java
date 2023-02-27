package com.capozzi.calcfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calcolatrice extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calcolatrice.class.getResource("calcolatrice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 270, 450);
        stage.setTitle("Calcolatrice");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}