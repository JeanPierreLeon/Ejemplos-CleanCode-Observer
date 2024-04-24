package co.edu.uniquindio.cleancodefx.cleancodeapp.viewmodel;

import co.edu.uniquindio.cleancodefx.cleancodeapp.usecase.CalculadoraUseCase;
import co.edu.uniquindio.cleancodefx.cleancodeapp.view.CalculadoraView;

public class CalculadoraViewModel {
    private CalculadoraUseCase useCase;
    private CalculadoraView view;

    public CalculadoraViewModel(CalculadoraUseCase useCase, CalculadoraView view) {
        this.useCase = useCase;
        this.view = view;
    }

    public void calculate(char operator, String num1, String num2) {
        String result = useCase.execute(operator, num1, num2);
        view.updateResultLabel(result);
    }
}

