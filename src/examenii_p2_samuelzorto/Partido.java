package examenii_p2_samuelzorto;

public class Partido {
    private String nombre1, nombre2;
    private int putaje1, puntaje2;

    public Partido() {
    }

    public Partido(String nombre1, String nombre2, int putaje1, int puntaje2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.putaje1 = putaje1;
        this.puntaje2 = puntaje2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPutaje1() {
        return putaje1;
    }

    public void setPutaje1(int putaje1) {
        this.putaje1 = putaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    @Override
    public String toString() {
        return "Partido{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", putaje1=" + putaje1 + ", puntaje2=" + puntaje2 + '}';
    }
    
    
    
}
