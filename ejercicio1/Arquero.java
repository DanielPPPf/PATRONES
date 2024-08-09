import java.util.ArrayList;

public class Arquero extends Heroe implements IHeroe {
    @Override
    public Heroe clonarHeroe() {
        Arquero clon = new Arquero();
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
        System.out.println("Arquero atacando pium pium");
    }

    @Override
    public void defender() {
        System.out.println("Arquero defendiendo shing shing");

    }

}
