package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textIn;
    @FXML
    private TextField textOut;
    
    public void btnSendClick(ActionEvent actionEvent) {
        String text = textIn.getText() + textOut.getText() + "\n";
        textIn.setText(text);

    }
}
