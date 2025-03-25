package com.example.bibliotecadi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Escenas {
    @FXML
    public TextField txdEnviarDatos;
    @FXML
    public TextField txdEnviarISBN;
    @FXML
    public Button BotEnviar;
    @FXML
    public Button BotEnviar2;
    @FXML
    public TextField txdEnviarAutor;
    @FXML
    public Button BotEnviar3;
    @FXML
    public Button BotEnviar4;
    @FXML
    public TextField txdagregar;
    @FXML
    public TextField txdagregar1;
    @FXML
    public TextField txdagregar2;
    @FXML
    public TextField txdagregar3;
    @FXML
    public TextField txdagregar4;
    @FXML
    public TextField txdagregar5;
    @FXML
    public Button BotEnviar5;
    @FXML
    public TextField txdagregarmodif;
    @FXML
    public TextField txdagregarmodif1;
    @FXML
    public TextField txdagregarmodif2;
    @FXML
    public TextField txdagregarmodif3;
    @FXML
    public TextField txdagregarmodif4;
    @FXML
    public TextField txdagregarmodif5;
    @FXML
    public TextField txdagregarmodif6;

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

    public void DetallesLibroButtonClick(ActionEvent event) {
        try {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


            FXMLLoader loader = new FXMLLoader(Escenas.class.getResource("DetallesLibroXML.fxml"));
            Scene scene = new Scene(loader.load(), 675, 380);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void EnviarButtonClick(ActionEvent event) {
        txdEnviarDatos.clear();
        txdEnviarDatos.setDisable(true); BotEnviar.setDisable(true);
    }

    @FXML
    public void Enviar2ButtonClick(ActionEvent event) {
        String isbn = txdEnviarISBN.getText();
        txdEnviarISBN.clear();
        txdEnviarISBN.setDisable(true); BotEnviar2.setDisable(true);
    }

    @FXML
    public void Enviar3ButtonClick(ActionEvent event) {
        txdEnviarAutor.clear();
        txdEnviarAutor.setDisable(true); BotEnviar3.setDisable(true);
    }
    @FXML
    public void Enviar4ButtonClick(ActionEvent event) {
        BotEnviar4.setDisable(true);
        txdagregar.clear();
        txdagregar1.clear();
        txdagregar2.clear();
        txdagregar3.clear();
        txdagregar4.clear();
        txdagregar5.clear();
        txdagregar.setDisable(true);
        txdagregar1.setDisable(true);
        txdagregar2.setDisable(true);
        txdagregar3.setDisable(true);
        txdagregar4.setDisable(true);
        txdagregar5.setDisable(true);
    }

    public void Enviar5ButtonClick(ActionEvent event) {
        BotEnviar5.setDisable(true);
        txdagregarmodif.clear();
        txdagregarmodif1.clear();
        txdagregarmodif2.clear();
        txdagregarmodif3.clear();
        txdagregarmodif4.clear();
        txdagregarmodif5.clear();
        txdagregarmodif6.clear();
        txdagregarmodif.setDisable(true);
        txdagregarmodif1.setDisable(true);
        txdagregarmodif2.setDisable(true);
        txdagregarmodif3.setDisable(true);
        txdagregarmodif4.setDisable(true);
        txdagregarmodif5.setDisable(true);
        txdagregarmodif6.setDisable(true);
    }
}
