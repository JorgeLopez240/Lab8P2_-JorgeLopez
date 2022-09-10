
package Package1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUniverso {
    
    private ArrayList<Universo> listaUniversos = new ArrayList();
    private File archivo = null;

    public AdminUniverso(String path) {
        archivo = new File(path);
    }

    public ArrayList<Universo> getListaUniversos() {
        return listaUniversos;
    }

    public void setListaUniversos(ArrayList<Universo> listaUniversos) {
        this.listaUniversos = listaUniversos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaUniversos=" + listaUniversos;
    }
    
    //extra mutador
    public void setUniverso(Universo u){
        this.listaUniversos.add(u);
    }
    
    public void cargarArchivo() {
        try {
            listaUniversos=new ArrayList();
            Universo temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Universo) objeto.readObject()) != null) {
                            listaUniversos.add(temp);
                        }
                } catch (EOFException e) {
                }
                entrada.close();
                objeto.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, false);
            bw = new ObjectOutputStream(fw);
            for (Universo t : listaUniversos) {
                bw.writeObject(t);
            }
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
