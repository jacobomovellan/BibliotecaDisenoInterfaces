package com.example.bibliotecadi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Escenas {
    public void EntrarBibliotecaButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("BibliotecaGestionXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListarLibrosButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("ListarLibrosXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarLibrosButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("AgregarLibrosXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ModificarDatosButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("ModificarDatosXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BorrarLibrosButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("BorrarLibrosXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void VolverButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("BibliotecaXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Volver2ButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("BibliotecaGestionXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
