module co.edu.uniquindio.parcial1fx.observer {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.observer to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.observer;
}