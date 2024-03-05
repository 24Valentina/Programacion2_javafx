package co.edu.uniquindio.computerfx.maestroapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MaestroApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MaestroApplication.class.getResource("maestro.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Maestros del Qundio");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();}
}