module com.example.bibliotecadi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bibliotecadi to javafx.fxml;
    exports com.example.bibliotecadi;
}