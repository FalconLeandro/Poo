package calculadora;

public class Suma extends Operacion{
    double suma;

    public Suma(double num1, double num2){
        super(num1,num2,'+');
        this.suma = num1 + num2;
        this.setResultado(this.suma);
    }
}
