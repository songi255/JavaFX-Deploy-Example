module com.example.javafxdeployexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.javafxdeployexample to javafx.fxml;
    exports com.example.javafxdeployexample;
}