module com.example.comp1011st1178551test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.comp1011st1178551test2 to javafx.fxml,com.google.gson;
    exports com.example.comp1011st1178551test2;
}