package com.example.comp1011st1178551test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
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
    Dealership dealer;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dealer = JSONUtility.JSONtoDealership();
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
        updateLabels();
    }
    private void updateLabels(){
        valueLabel.setText("Value of Cars in table: $" + getTotalValue());
        totalCarsLabel.setText("Number of cars: " + getTotalCars());
        averageSizeLabel.setText("Average engine size: " + getAverageEngine());

    }
    private double getTotalValue(){
        double total=0;
        for(int i=0; i< tableView.getItems().size();i++){
            total+=priceColumn.getCellData(i);
        }
        return total;
    }
    private int getTotalCars(){
        return tableView.getItems().size();
    }
    private double getAverageEngine(){
        double total=0;
        for(int i=0; i< tableView.getItems().size();i++){
            total+=engineColumn.getCellData(i);
        }

        return total/tableView.getItems().size();
    }
}
