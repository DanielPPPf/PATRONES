import java.util.ArrayList;
import java.util.List;

public abstract class Heroe implements IHeroe {
    protected String nombre;
    protected Aspecto aspecto;
    protected int experiencia;
    protected int nivel;
    protected int puntosHabilidad;
    protected List<Habilidad> habilidades = new ArrayList<>();

    public void agregarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    public void removerHabilidad(Habilidad habilidad) {
        habilidades.remove(habilidad);
    }

    public void cambiarAspecto(Aspecto nuevoAspecto) {
        this.aspecto = nuevoAspecto;
    }

    public abstract Heroe clonarHeroe();

    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", aspecto=" + aspecto +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                ", puntosHabilidad=" + puntosHabilidad +
                ", habilidades=" + habilidades +
                '}';
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }
}
