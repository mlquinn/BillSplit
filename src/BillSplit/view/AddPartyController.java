package BillSplit.view;

import BillSplit.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddPartyController {
    @FXML
    TextField partyName_tf;
    @FXML
    ListView itemListView;

    private MainApp mainApp;
    private Stage dialogStage;
    private boolean okClicked = false;

    public void setDialogStage(Stage Stage){
        this.dialogStage = Stage;
    }

    public boolean isOkClicked(){
        return okClicked;
    }

    @FXML
    private void handleOkButton(){
        okClicked = true;
        dialogStage.close();
        System.out.println("PARTYCONTROLLER_HANDLE_OK_BUTTON");
    }
    @FXML
    private void handleCancelButton(){
        System.out.println("PARTYCONTROLLER_HANDLE_CANCEL_BUTTON");
        //TODO: fix issue of dialogStage being a null invocation target. WHY IS THIS NOT SET?!
        dialogStage.close();
    }


    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
}
