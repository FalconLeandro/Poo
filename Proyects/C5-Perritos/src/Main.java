/*Alimentemos a los perritos

        Ejercicio
        En la veterinaria tienen perros de diferentes tipos. Cada uno de ellos come una cantidad fija de
        alimento balanceado por día. El proveedor de alimentos le envía un pack con diferentes
        cantidades de alimento. En cada uno hay sobres con pequeñas raciones para que se consuman
        por cada día, sabiendo que deben darles por lo menos 3 kg por día para que cada perro no se
        sienta con hambre y ladre toda la noche.
        Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre
        y la cantidad de comida que come el perro. La idea es que mediante una función llamada
        cuantosPaquetes indique el nombre y cuantos paquetes usará. Dada la cantidad necesaria la
        función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
        cantidad y retorna el número de paquetes que precisó.
        Ejemplo:
        Rintintin come 4 kg diarios.
        paquetes : 1.2 0.7 1.1 1.3
        resultado: Rintintin precisa 4 paquetes.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro:");
        String nombre = input.nextLine();
        System.out.println("Ingrese su consumo diario:");
        double cantidadDeComida = input.nextDouble();

        int TotalPaquetes = cuantosPaquetes(cantidadDeComida,input);

        System.out.println("El perro consume: " + TotalPaquetes + " paquetes diarios.") ;


    }
    static int cuantosPaquetes(double cantidadDeComida,Scanner input){
        double acumuladoComida = 0.0;
        int cantidadDePaquetes = 0;

         while(acumuladoComida<cantidadDeComida){
             System.out.println("Ingrese el peso del paquete");
             acumuladoComida = acumuladoComida + input.nextDouble();
             cantidadDePaquetes++;
        }
        return cantidadDePaquetes;
    }
}