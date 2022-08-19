/*Ejercitación Ingreso de datos

        Objetivo
        El objetivo es poder practicar el uso de la sintaxis del lenguaje de programación Java.
        Ejercicio 1
        Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        una tercera tus iniciales.*/

public class Main {
    public static void main(String[] args) {
        String nombre = "Leandro";
        String apellido = "Falcon";
        char inicial1 = nombre.charAt(0);
        char inicial2 = apellido.charAt(0);

        System.out.println(inicial1 + inicial2);

    }
}