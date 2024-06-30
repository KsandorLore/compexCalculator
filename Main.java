import calculator.ComplexNumber;

public class Main {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);

        ComplexNumber b = new ComplexNumber(3, 4);

        Calculator.add(a, b);
        Calculator.multuply(a, b);
        Calculator.divide(a, b);

    }


    
}
