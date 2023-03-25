package examenii_p2_samuelzorto;

public class Equipo {
    private String nombre;
    private int puntos;

    public Equipo() {
    }

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", puntos=" + puntos + '}';
    }
    
    
}
