module com.example.appfaztudo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.appfaztudo to javafx.fxml;
    exports com.example.appfaztudo;
}