package com.example.bibliotecadi;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("BibliotecaXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 675, 380);
        stage.setTitle("BibliotecaDI");

        //Icono de la aplicación
        Image icon = new Image(getClass().getResourceAsStream("/images/iconoapp.png"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}