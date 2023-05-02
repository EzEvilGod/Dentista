package com.example.ferruzzo.navigationdentistbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DentistControl {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button button;

    public void LoginBtn(ActionEvent event) throws IOException {
        checkAdmin();
    }

    public void checkAdmin() throws IOException {
        DentistApp dentist = new DentistApp();
        if (username.getText().toString().equals("admin") && password.getText().equals("1234")){
            DentistPageController controller = new DentistPageController();
            dentist.changeScene("DentistPage.fxml");
        }
    }
}