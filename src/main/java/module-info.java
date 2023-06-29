module com.example.javafxeventhandling {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javafxeventhandling to javafx.fxml;
    exports com.example.javafxeventhandling;
}