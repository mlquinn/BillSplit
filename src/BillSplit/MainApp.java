package BillSplit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import BillSplit.view.*;

public class MainApp extends Application {
    public Stage primaryStage;
    public BorderPane rootLayout;

    public void start (Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("BillSplit");

        initRootLayout();
        initWelcomePage();
    }

    public boolean showAddPartyDialog(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/AddPartyDialog.fxml"));
            AnchorPane addPartyPane = loader.load();


            Stage dialogStage = new Stage();
            dialogStage.setWidth(400);
            dialogStage.setHeight(300);
            dialogStage.setTitle("Add Party");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            AddPartyController controller = new AddPartyController();
            controller.setMainApp(this);
            controller.setDialogStage(dialogStage);

            Scene dialogScene = new Scene(addPartyPane);
            dialogStage.setScene(dialogScene);


            dialogStage.showAndWait();

            return controller.isOkClicked();

        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }

    private void initWelcomePage(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/WelcomePageLayout.fxml"));
            AnchorPane welcomePage = loader.load();

            rootLayout.setCenter(welcomePage);

            WelcomePageController controller = loader.getController();
            controller.setMainApp(this);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void initRootLayout(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) { launch(args);}
}
