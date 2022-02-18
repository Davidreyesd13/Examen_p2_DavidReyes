public abstract class Persona {
    String nombre,poder,debilidad,tipo;
    int fuerza,habilidadm,habilidadf;
    boolean squad;

    public Persona(String nombre, String poder, String debilidad, String tipo, int fuerza, int habilidadm, int habilidadf, boolean squad) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.habilidadm = habilidadm;
        this.habilidadf = habilidadf;
        this.squad = squad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadm() {
        return habilidadm;
    }

    public void setHabilidadm(int habilidadm) {
        this.habilidadm = habilidadm;
    }

    public int getHabilidadf() {
        return habilidadf;
    }

    public void setHabilidadf(int habilidadf) {
        this.habilidadf = habilidadf;
    }

    public boolean isSquad() {
        return squad;
    }

    public void setSquad(boolean squad) {
        this.squad = squad;
    }
  abstract void final_chance();
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", tipo=" + tipo + ", fuerza=" + fuerza + ", habilidadm=" + habilidadm + ", habilidadf=" + habilidadf + ", squad=" + squad + '}';
    }
    
}
