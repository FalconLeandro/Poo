package calculadora;

public class Operacion {
    private double num1;
    private double num2;
    private char operacion;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    private double resultado;

    public Operacion(double num1,double num2, char operacion){
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public void mostrarResultado(){
        System.out.println(this.num1 + " " + this.operacion + " " + this.num2 + " = " + this.resultado );
    }
}
