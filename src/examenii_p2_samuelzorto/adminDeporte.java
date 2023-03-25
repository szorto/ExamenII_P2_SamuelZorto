package examenii_p2_samuelzorto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminDeporte {

    private Deporte d;
    private ArrayList<Deporte> listaDeporte = new ArrayList();
    private File archivo = null;

    public adminDeporte(String path) {
        archivo = new File(path);
    }

    public ArrayList<Deporte> getListaDeporte() {
        return listaDeporte;
    }

    public void setListaDeporte(ArrayList<Deporte> listaDeporte) {
        this.listaDeporte = listaDeporte;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Deporte getD() {
        return d;
    }

    public void setD(Deporte d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "adminDeporte{" + "listaDeporte=" + listaDeporte + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaDeporte = new ArrayList();
            Deporte temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        d = temp;
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);

            bw.writeObject(d);

            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
