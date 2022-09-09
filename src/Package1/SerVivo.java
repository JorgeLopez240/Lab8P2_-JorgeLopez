
package Package1;

public class SerVivo {
  
    private String nombre;
    private String id;
    private int poder; // 1-10
    private int years;
    private Universo universo;
    private String raza; // Humano o Amanto

    public SerVivo() {
    }

    public SerVivo(String nombre, String id, int poder, int years, Universo universo, String raza) {
        this.nombre = nombre;
        this.id = id;
        setPoder(poder);
        this.years = years;
        this.universo = universo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if(poder>=1 && poder <=10){
            this.poder = poder;
        }
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Universo getUniverso() {
        return universo;
    }

    public void setUniverso(Universo universo) {
        this.universo = universo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
