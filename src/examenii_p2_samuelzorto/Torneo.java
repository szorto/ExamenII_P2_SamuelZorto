package examenii_p2_samuelzorto;

import java.util.ArrayList;

public class Torneo {
    private String nombre;
    private ArrayList<Equipo> listaEquipo = new ArrayList();
    private ArrayList<Partido> listaPartido = new ArrayList();

    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public ArrayList<Partido> getListaPartido() {
        return listaPartido;
    }

    public void setListaPartido(ArrayList<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", listaEquipo=" + listaEquipo + ", listaPartido=" + listaPartido + '}';
    }
    
    
}
