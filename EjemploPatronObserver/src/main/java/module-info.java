module observer.ejemploobserver {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    exports observer.ejemploobserver;
    opens observer.ejemploobserver to javafx.fxml;

    exports observer.ejemploobserver.controller;
    opens observer.ejemploobserver.controller to javafx.fxml;

    opens observer.ejemploobserver.ObserverViewController to javafx.fxml;
    exports observer.ejemploobserver.ObserverViewController;

    exports observer.ejemploobserver.services;
    opens observer.ejemploobserver.services to javafx.fxml;}