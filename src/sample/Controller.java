package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznik.setText("Kliknięcie nr " + ++clickCounter);
        if (clickCounter ==  1)
            btnMain.setText("I jeszcze raz");
    }
}
