package juego;

import juego.UsuarioJuego;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario1;
        usuario1 = new UsuarioJuego("leandro","1034");
        System.out.println(usuario1.getPuntaje());
        usuario1.aumentarPuntaje();
        System.out.println(usuario1.getPuntaje());
        usuario1.bonus(6);
        System.out.println(usuario1.getPuntaje());
    }

}