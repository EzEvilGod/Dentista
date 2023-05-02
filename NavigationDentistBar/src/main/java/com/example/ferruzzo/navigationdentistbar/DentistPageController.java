package com.example.ferruzzo.navigationdentistbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;

public class DentistPageController {
    public AnchorPane daschboard_form;
    @FXML
    private Button dashboard_btn;
    @FXML
    private Button pazienti_btn;
    @FXML
    private Button medicinale_btn;
    @FXML
    private AnchorPane pazienti_form;
    @FXML
    private SplitPane medicinale_form;

    public DentistPageController() {

    }


    public void switchForm(ActionEvent event) {
        if (event.getSource() == dashboard_btn){
            daschboard_form.setVisible(true);
            pazienti_form.setVisible(false);
            medicinale_form.setVisible(false);
        } else if (event.getSource() == pazienti_btn) {
            daschboard_form.setVisible(false);
            pazienti_form.setVisible(true);
            medicinale_form.setVisible(false);
        } else if(event.getSource() == medicinale_btn){
            daschboard_form.setVisible(false);
            pazienti_form.setVisible(false);
            medicinale_form.setVisible(true);
        }
    }
}
