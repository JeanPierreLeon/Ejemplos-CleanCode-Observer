package co.edu.uniquindio.cleancodefx.cleancodeapp.usecase;

public class CalculadoraUseCase {

    public String execute(char operator, String num1Str, String num2Str) {
        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);
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
                        return "Cannot divide by zero";
                    }
                    result = (double) num1 / num2;
                    break;
                default:
                    return "Invalid operator";
            }
            return "Resultado: " + result;
        } catch (NumberFormatException e) {
            return "Entrada inválida";
        }
    }
}
