package co.edu.uniquindio.cleancodefx.cleancodeapp;

import co.edu.uniquindio.cleancodefx.cleancodeapp.usecase.CalculadoraUseCase;
import co.edu.uniquindio.cleancodefx.cleancodeapp.view.CalculadoraView;
import co.edu.uniquindio.cleancodefx.cleancodeapp.viewmodel.CalculadoraViewModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CalculadoraView view = new CalculadoraView();
        CalculadoraUseCase useCase = new CalculadoraUseCase();
        CalculadoraViewModel viewModel = new CalculadoraViewModel(useCase, view);

        view.start(primaryStage, viewModel);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


