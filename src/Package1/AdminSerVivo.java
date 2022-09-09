
package Package1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminSerVivo {
 
    private ArrayList<SerVivo> listaSeres = new ArrayList();
    private File archivo = null;

    public AdminSerVivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<SerVivo> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<SerVivo> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ListaSeresVivos=" + listaSeres;
    }
    
    public void setSerVivo(SerVivo sv){
        this.listaSeres.add(sv);
    }
    
    public void cargarArchivo(){
        try {
            listaSeres=new ArrayList();
            SerVivo temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SerVivo) objeto.readObject()) != null) {
                            listaSeres.add(temp);
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
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (SerVivo t : listaSeres) {
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
