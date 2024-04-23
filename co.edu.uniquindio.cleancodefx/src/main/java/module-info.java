module co.edu.uniquindio.cleancodefx.cleancodeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.cleancodefx.cleancodeapp to javafx.fxml;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp;
}