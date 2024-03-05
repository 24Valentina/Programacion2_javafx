module co.edu.uniquindio.computerfx.maestroapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.computerfx.maestroapp to javafx.fxml;
    exports co.edu.uniquindio.computerfx.maestroapp;

    exports co.edu.uniquindio.computerfx.maestroapp.controller;
    opens co.edu.uniquindio.computerfx.maestroapp.controller;
}