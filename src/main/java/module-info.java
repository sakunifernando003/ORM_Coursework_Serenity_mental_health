module org.example.serene_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.serene_management_system to javafx.fxml;
    exports org.example.serene_management_system;
}