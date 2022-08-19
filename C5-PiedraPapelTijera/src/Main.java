import java.util.Objects;
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

        System.out.println("Nombre del Jugador 1: ");
        String nombrePlayer1 = input.nextLine();

        System.out.println("Nombre del Jugador 2: ");
        String nombrePlayer2 = input.nextLine();

        game(nombrePlayer1,nombrePlayer2,input);


        System.out.println("Hasta la proxima!");

    }

    static void game(String nombrePlayer1, String nombrePlayer2, Scanner input){
        String opcionJugador1 = "";
        String opcionJugador2 = "";

        int marcadorPlayer1 = 0;
        int marcadorPlayer2 = 0;

        while ((marcadorPlayer1<=2) && (marcadorPlayer2<=2)) {
            System.out.println(nombrePlayer1 + " elegi una opcion:\n(1) Piedra\n(2) Papel\n(3) Tijera\n(4) Salir");
            opcionJugador1 = input.nextLine();
            if(opcionJugador1.equals("4")) {
                return;
            }
            System.out.println(nombrePlayer2 + " elegi una opcion:\n(1) Piedra\n(2) Papel\n(3) Tijera\n(4) Salir");
            opcionJugador2 = input.nextLine();
            if(opcionJugador2.equals("4")) {
                return;
            }

            int ganador = cualGana(opcionJugador1,opcionJugador2);

            if (ganador == 0) {
                System.out.println("Empate");

            } else if (ganador == 1) {
                System.out.println(opcionJugador1+" gana a " + opcionJugador2);
                System.out.println(nombrePlayer1 + " gana.");
                marcadorPlayer1++;
            }else if(ganador == 2){
                System.out.println(opcionJugador2+" gana a " + opcionJugador1);
                System.out.println(nombrePlayer2 + " gana.");
                marcadorPlayer2++;
            }
            System.out.println(nombrePlayer1 + ": " + marcadorPlayer1);
            System.out.println(nombrePlayer2 + ": " + marcadorPlayer2);

        };
        if (marcadorPlayer1 >= marcadorPlayer2) {
            System.out.println(nombrePlayer1 + " gano 3 partidas por ende el juego ");
        }else{
            System.out.println(nombrePlayer2 + " gano 3 partidas por ende el juego ");
        }
    }
    static int cualGana(String opcionJugador1,String opcionJugador2){
        if (opcionJugador1.equals(opcionJugador2)) {
            return 0;
        } else if ((opcionJugador1.equals("1") && opcionJugador2.equals("3")) || opcionJugador1.equals("2") && opcionJugador2.equals("1") || opcionJugador1.equals("3") && opcionJugador2.equals("2")) {
            return 1;
        }else{
            return 2;
        }
    }
}
