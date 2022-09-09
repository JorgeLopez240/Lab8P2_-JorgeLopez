
package Package1;

import java.util.ArrayList;

public class Universo {

    private String nombre;
    private ArrayList<SerVivo> seresVivos = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
