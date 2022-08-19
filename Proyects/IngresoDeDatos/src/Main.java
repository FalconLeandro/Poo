import java.util.Scanner;

/*Ejercicio 1
        Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        una tercera tus iniciales.*/
public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();
        System.out.println("Ingresa tu apellido");
        String apellido = input.nextLine();


        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Tus iniciales son: " + nombre.toUpperCase().charAt(0) + apellido.toUpperCase().charAt(0));
    }
}