module com.example.tpormjpahibernatespringdata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpormjpahibernatespringdata to javafx.fxml;
    exports com.example.tpormjpahibernatespringdata;
}