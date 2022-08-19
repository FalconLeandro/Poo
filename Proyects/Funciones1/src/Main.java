import java.util.Scanner;

/*Ejercicio 1
        Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
        función debe comprobar si el primer número es divisible por el segundo.
        boolean esDivisible(int n, int divisor)*/
public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = input.nextInt();

        System.out.println("Ingrese otro numero");
        int numero2 = input.nextInt();

        System.out.println(esDivisible(numero1,numero2));



    }
    static boolean esDivisible(int n, int divisor){
        if (n%divisor==0) {
            return true;
        }else{
            return false;
        }
    }
}