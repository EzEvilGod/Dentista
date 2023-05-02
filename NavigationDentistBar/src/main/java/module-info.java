module com.example.ferruzzo.navigationdentistbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ferruzzo.navigationdentistbar to javafx.fxml;
    exports com.example.ferruzzo.navigationdentistbar;
}