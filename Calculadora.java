public class Calculadora implements ICalculadora {
    float resultado;


    public float sum( float a, float b){
        this.resultado = a + b;
        return this.resultado;

    }
    public float subtraction(float a, float b) {
        this.resultado = a - b;
        return this.resultado;

    }
    public float multiply(float a, float b) {
        this.resultado = a * b;
        return this.resultado;

    }
}   public float divition(float a, float b) {
    this.resultado = a / b;
    return this.resultado;
}
