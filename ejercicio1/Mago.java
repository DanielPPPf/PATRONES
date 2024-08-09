import java.util.ArrayList;

public class Mago extends Heroe implements IHeroe {
    @Override
    public Heroe clonarHeroe() {
        Mago clon = new Mago();
        clon.nombre = this.nombre;
        clon.aspecto = this.aspecto.copiar();
        clon.experiencia = this.experiencia;
        clon.nivel = this.nivel;
        clon.puntosHabilidad = this.puntosHabilidad;
        clon.habilidades = new ArrayList<>(this.habilidades);
        return clon;
    }

    @Override
    public void atacar() {
        System.out.println("Mago atacando splash chiplum");
    }

    @Override
    public void defender() {
        System.out.println("Mago defendiendo shing shing");

    }
}
