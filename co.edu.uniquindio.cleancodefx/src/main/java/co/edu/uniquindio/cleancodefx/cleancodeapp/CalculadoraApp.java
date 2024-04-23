package co.edu.uniquindio.cleancodefx.cleancodeapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {
    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculadora Simple");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label num1Label = new Label("Número 1:");
        GridPane.setConstraints(num1Label, 0, 0);
        num1Field = new TextField();
        GridPane.setConstraints(num1Field, 1, 0);

        Label num2Label = new Label("Número 2:");
        GridPane.setConstraints(num2Label, 0, 1);
        num2Field = new TextField();
        GridPane.setConstraints(num2Field, 1, 1);

        Button addButton = new Button("Sumar");
        GridPane.setConstraints(addButton, 0, 2);
        addButton.setOnAction(e -> calculate('+'));
        Button subtractButton = new Button("Restar");
        GridPane.setConstraints(subtractButton, 1, 2);
        subtractButton.setOnAction(e -> calculate('-'));
        Button multiplyButton = new Button("Multiplicar");
        GridPane.setConstraints(multiplyButton, 0, 3);
        multiplyButton.setOnAction(e -> calculate('*'));
        Button divideButton = new Button("Dividir");
        GridPane.setConstraints(divideButton, 1, 3);
        divideButton.setOnAction(e -> calculate('/'));

        resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 0, 4);

        grid.getChildren().addAll(num1Label, num1Field, num2Label, num2Field,
                addButton, subtractButton, multiplyButton, divideButton, resultLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate(char operator) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        resultLabel.setText("Cannot divide by zero");
                        return;
                    }
                    result = (double) num1 / num2;
                    break;
                default:
                    resultLabel.setText("Invalid operator");
                    return;
            }
            resultLabel.setText("Resultado: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}