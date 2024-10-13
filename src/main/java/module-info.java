module com.example.anonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anonymousinnerclass to javafx.fxml;
    exports com.example.anonymousinnerclass;
    exports es.ieslosmontecillos.demo;
    opens es.ieslosmontecillos.demo to javafx.fxml;
}