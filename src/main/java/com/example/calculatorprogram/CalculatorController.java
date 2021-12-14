package com.example.calculatorprogram;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculatorController {

    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private Label answerText;

    @FXML
    protected void onCalculateButtonClick() {
        answerText.setText(Integer.toString(calculateAnswer()));
    }

    private int calculateAnswer() {
        int total = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
        return total;
    }

    @FXML
    protected void onDistractionButtonClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("LoadingScreen.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage stage = new Stage();
            stage.setTitle("Loading Screen");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}



