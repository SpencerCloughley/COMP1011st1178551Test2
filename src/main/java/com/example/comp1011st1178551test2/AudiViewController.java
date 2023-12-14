package com.example.comp1011st1178551test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AudiViewController implements Initializable {

    @FXML
    private Label addressLabel;

    @FXML
    private Label averageSizeLabel;

    @FXML
    private TableColumn<Audi, Double> engineColumn;

    @FXML
    private TextField filterTextField;

    @FXML
    private TableColumn<Audi, String> fuelColumn;

    @FXML
    private TableColumn<Audi, Double> milesColumn;

    @FXML
    private TableColumn<Audi, String> modelColumn;

    @FXML
    private ComboBox<?> modelCombo;

    @FXML
    private TableColumn<Audi, Double> priceColumn;

    @FXML
    private Label titleLabel;

    @FXML
    private Label totalCarsLabel;

    @FXML
    private TableColumn<Audi, String> tranmissionColumn;

    @FXML
    private Label valueLabel;

    @FXML
    private TableColumn<Audi, Integer> yearColumn;

    @FXML
    private TableView<Audi> tableView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Dealership dealer = JSONUtility.JSONtoDealership();
        titleLabel.setText(dealer.getDealer());
        addressLabel.setText(dealer.getAddress());


        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        fuelColumn.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        milesColumn.setCellValueFactory( new PropertyValueFactory<>("mpg"));
        engineColumn.setCellValueFactory(new PropertyValueFactory<>("engineSize"));
        tranmissionColumn.setCellValueFactory(new PropertyValueFactory<>("transmission"));

        tableView.getItems().addAll(((dealer.getAudis())));

    }
}
