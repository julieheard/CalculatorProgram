package com.example.calculatorprogram;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoadingScreen {
    @FXML
    private Button calculateButton;

    @FXML
    protected void calculatorButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("Calculator.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage stage = new Stage();
            stage.setTitle("Calculator");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide(); //This hides the screen which is the same as deleting the elements
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
