
import calculator.ComplexNumber;


public class Calculator {

    
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
        System.out.printf("Adding complex nimbers %s and %s\n", a, b);
        ComplexNumber sum = a.add(b);
        System.out.printf("Result: %s", sum);
        return sum;
    }

    public static ComplexNumber multuply(ComplexNumber a, ComplexNumber b){
        System.out.printf("Multyplying complex nimbers %s and %s\n", a, b);
        ComplexNumber product = a.multyply(b);
        System.out.printf("Result: %s", product);
        return product;
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b){
        if (b.getReal() == 0 && b.getImg() == 0) {
            throw  new IllegalArgumentException("Cannot divide by zero");
        }

        System.out.printf("Dividing complex nimbers %s and %s\n", a, b);
        ComplexNumber quotient = a.divide(b);
        System.out.printf("Result: %s", quotient);
        return quotient;
    }
}