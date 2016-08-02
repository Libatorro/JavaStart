package Teamt18_wyjatki;

/**
 * Created by Sebastian on 2016-04-16.
 */
public class Calculator {
    public final String PLUS = "+";
    public final String MINUS = "-";
    public final String MULTIPLY = "*";
    public final String DIVIDE = "/";

    public double calculate(double a, double b, String operator) throws ArithmeticException,
            UnkownOperatorException {
        double result = 0;

        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if(b == 0) {
                    throw new ArithmeticException("Nie możesz dzielić przez 0!");
                }
                result = a / b;
                break;
            default:
                throw new UnkownOperatorException("Wykorzystujesz niezdefiniowany operator arytmetyczny");
        }

        return result;
    }
}

