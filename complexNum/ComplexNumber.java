package calculator;

public class ComplexNumber {

    private double real;
    private double img;

    public ComplexNumber(double real, double img){
        this.real = real;
        this.img = img;
    }

    public double getReal(){
        return real;
    }

    public double getImg(){
        return img;
    }

    public void setReal(){
        this.real = real;
    }

    public void setImg(){
        this.img = img;
    }

    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(this.real + other.real, this.img + other.img);
        
    }

    public ComplexNumber multyply(ComplexNumber other){
        double realProduct = this.real * other.real - this.img * other.img;
        double imgProduct = this.real * other.img + this.img * other.img;
        return new ComplexNumber(realProduct, imgProduct);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double realNumerator = this.real * other.real + this.img * other.img;
        double imgNumerator = this.real * other.real - this.img * other.img;
        double denominator = other.real * other.real + other.img * other.img;
        double realQuotient = realNumerator / denominator;
        double imgQuotient = imgNumerator / denominator;
        return  new ComplexNumber(realQuotient, imgQuotient);
        
    }

    

}
