package examenii_p2_samuelzorto;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable{
    private String nombre;
    private ArrayList<Torneo> listaTorneo = new ArrayList();

    
    private static final long SerialVersionUID=777L;
    
    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getListaTorneo() {
        return listaTorneo;
    }

    public void setListaTorneo(ArrayList<Torneo> listaTorneo) {
        this.listaTorneo = listaTorneo;
    }



    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
