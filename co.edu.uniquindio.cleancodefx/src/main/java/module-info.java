module co.edu.uniquindio.cleancodefx.cleancodeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.cleancodefx.cleancodeapp to javafx.fxml;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp.viewmodel;
    opens co.edu.uniquindio.cleancodefx.cleancodeapp.viewmodel to javafx.fxml;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp.repository;
    opens co.edu.uniquindio.cleancodefx.cleancodeapp.repository to javafx.fxml;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp.usecase;
    opens co.edu.uniquindio.cleancodefx.cleancodeapp.usecase to javafx.fxml;
    exports co.edu.uniquindio.cleancodefx.cleancodeapp.view;
    opens co.edu.uniquindio.cleancodefx.cleancodeapp.view to javafx.fxml;
}