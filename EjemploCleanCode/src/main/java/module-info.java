module co.edu.uniquindio.cleancode.cleancodeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.cleancode.cleancodeapp to javafx.fxml;
    exports co.edu.uniquindio.cleancode.cleancodeapp;

    opens co.edu.uniquindio.cleancode.cleancodeapp.VIewController;
    exports co.edu.uniquindio.cleancode.cleancodeapp.VIewController;

}