module ca.senecacollege.application.ws45 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.senecacollege.application.ws45 to javafx.fxml;
    exports ca.senecacollege.application.ws45;
}