package juego;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void aumentarPuntaje(){
        puntaje = puntaje+1;
    }
    public void subirNivel(){
        nivel = nivel+1;
    }
    public void bonus(int valorExtra){
        puntaje = puntaje + valorExtra;
    }
}
