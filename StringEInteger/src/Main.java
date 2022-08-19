/*Ejercitación String e Integer
        Ejercicio 1
        Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        mensaje.

        Ejercicio 2

        Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        Informar el resultado obtenido.*/

public class Main {
    public static void main(String[] args) {
        /*String cadena1 = "Tu vieja en tanga";
        String cadena2 = "Tu vieja en camison";
        ;

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");

        }*/
        Integer numero1 = 50;
        Integer numero2 = 8;

        if (numero1.compareTo(numero2)==1) {
            System.out.println("numero1 es mayor");
        } else if (numero1.compareTo(numero2)==-1) {
            System.out.println("numero1 es menor");
        }else{
            System.out.println("son iguales");

        }

    }
}