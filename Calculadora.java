public class Calculadora implements ICalculadora {

    double resultado;

    public double sum(double a, double b) {
        this.resultado = a + b;
        return this.resultado;
    }

    public double substraction(double a, double b) {
        this.resultado = a - b;
        return this.resultado;
    }

    public double multiply(double a, double b) {
        this.resultado = a * b;
        return this.resultado;
    }

    public double divition(double a, double b) {
        this.resultado = a / b;
        return this.resultado;
    }
    
}
