import java.util.Scanner;

/*Desafío 1
        Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        cuando el primero elije “*” como indicador de final.*/
public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Ingresa el nombre del jugador 1: ");
        String nombrePlayer1 = input.nextLine();
        System.out.println("Ingresa el nombre del jugador 2: ");
        String nombrePlayer2 = input.nextLine();

        String eleccionJ1 = "";
        String eleccionJ2;
        int contadorPlayer1 = 0;
        int contadorPlayer2 = 0;

        while ((!eleccionJ1.equals("*"))){

            System.out.println(nombrePlayer1 + ": elige una opcion: \n(1) Piedra\n(2)-Papel\n(3)-Tijera\n(*)-Salir");
            eleccionJ1 = input.nextLine();
            System.out.println(eleccionJ1);

            System.out.println(nombrePlayer2 + ": elige una opcion: \n(1) Piedra\n(2)-Papel\n(3)-Tijera\n(*)-Salir");
            eleccionJ2 = input.nextLine();
            System.out.println(eleccionJ2);

            int ganador = cualGana(eleccionJ1,eleccionJ2);

            if (ganador == 0) {
                System.out.println("Empate");
                System.out.println(nombrePlayer1 + ": " + contadorPlayer1);
                System.out.println(nombrePlayer2 + ": " + contadorPlayer2);
            } else if (ganador == 1) {
                System.out.println(nombrePlayer1 + " gana");
                contadorPlayer1 ++;
                System.out.println(nombrePlayer1 + ": " + contadorPlayer1);
                System.out.println(nombrePlayer2 + ": " + contadorPlayer2);
            } else if (ganador == 2) {
                System.out.println(nombrePlayer2 + " gana");
                contadorPlayer2 ++;
                System.out.println(nombrePlayer1 + ": " + contadorPlayer1);
                System.out.println(nombrePlayer2 + ": " + contadorPlayer2);
            }

        }

        
        


    }
    static int cualGana(String eleccionJ1, String eleccionJ2){
        if (eleccionJ1.equals(eleccionJ2)) {
            return 0;
        } else if ((eleccionJ1.equals("1")&&(eleccionJ2.equals("3")))||(eleccionJ1.equals("3")&&(eleccionJ2.equals("2")))||(eleccionJ1.equals("2")&&(eleccionJ2.equals("1")))) {
            return 1;
        } else {
            return 2;
        }
    }
    
}