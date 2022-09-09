
package Package1;

import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable{

    private String nombre;
    private int cantidadSeresVivos;
    private ArrayList<SerVivo> seresVivos = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public Universo(String nombre, int cantidadSeresVivos) {
        this.nombre = nombre;
        this.cantidadSeresVivos = cantidadSeresVivos;
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

    public int getCantidadSeresVivos() {
        return cantidadSeresVivos;
    }

    public void setCantidadSeresVivos(int cantidadSeresVivos) {
        this.cantidadSeresVivos = cantidadSeresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
