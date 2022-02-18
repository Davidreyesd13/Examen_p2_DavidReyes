
import java.util.ArrayList;

public class Universe {
    String nombre;
    ArrayList<Escuadrones> mem;

    public Universe() {
    }

    public Universe(String nombre, ArrayList<Escuadrones> mem) {
        this.nombre = nombre;
        this.mem = mem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadrones> getMem() {
        return mem;
    }

    public void setMem(ArrayList<Escuadrones> mem) {
        this.mem = mem;
    }

    @Override
    public String toString() {
        return "Universe{" + "nombre=" + nombre + ",Escuadrones =" + mem + '}';
    }
    
}
