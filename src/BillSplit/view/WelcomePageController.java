package BillSplit.view;

import BillSplit.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class WelcomePageController {
    private MainApp mainApp;

    @FXML
    Label titleLabel;
    @FXML
    ImageView imageView;

    public void WelcomePageController(){

    }
    @FXML
    private void initialize(){
        titleLabel.setText("BillSplit");
        Image welcomePageLogo = new Image("File:res/RedSquare.png");
        imageView.setImage(welcomePageLogo);
    }

    @FXML
    private void handleNewBillButton(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/BillViewLayout.fxml"));
            SplitPane billView = loader.load();

            mainApp.rootLayout.setCenter(billView);

            BillViewController controller = loader.getController();
            controller.setMainApp(mainApp);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLoadBillButton(){
        //TODO: read file from system and load into scene
    }

    @FXML
    private void handleExitButton(){System.exit(0);}

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
}
