module com.example.calculatorprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorprogram to javafx.fxml;
    exports com.example.calculatorprogram;
}