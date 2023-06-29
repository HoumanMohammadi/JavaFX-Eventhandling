package com.example.javafxeventhandling;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private TextField textField;


    public void initialize(){

        textField.textProperty().addListener(((observableValue, oldValue, newValue) -> {
            if (newValue.length()>2){ label.setText(newValue);
            label.setTextFill(Color.GREEN);}
            else {label.setText("Eingabe zu kurz");
            label.setTextFill(Color.RED);}

        }));
    }

    @FXML
    public void updateLabelWithTextField(){
        label.setText(textField.getText());
    }

    public void resetEingabe(ActionEvent event) {
        textField.clear();
    }
}