package BillSplit.view;

import BillSplit.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import BillSplit.model.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.applet.Main;

import java.io.IOException;

public class BillViewController {
    private MainApp mainApp;

    @FXML
    HBox partyDashboard;

    @FXML
    TextField delivery_tf;
    @FXML
    TextField tax_tf;
    @FXML
    ChoiceBox tipBox;

    ObservableList<String> tipOptions =
            FXCollections.observableArrayList( "10%","15%","20%","25%","30%","Other");


    private void BillViewController(){

    }
    @FXML
    private void initialize(){
        //TODO: Add in PlusSign.png as AddParty button

        tipBox.setValue("20%");
        tipBox.setItems(tipOptions);
    }


    //TODO: figure out how to create the dashboard of current party bills
    @FXML
    private void addPartyButton(){
        System.out.println("BILLCONTROLLER_ADDPARTY_BUTTON");
        boolean okClicked = mainApp.showAddPartyDialog();
        if (okClicked){
            System.out.println("BILLCONTROLLER_OK_WAS_CLICKED");
        }
    }

    @FXML
    private void handlePrintButton(){
        //TODO: handle print
    }

    @FXML
    private void handleSaveButton(){
        //TODO: handle save
    }



    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
}
