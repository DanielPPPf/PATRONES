import java.util.ArrayList;

public class Guerrero extends Heroe implements IHeroe {
    @Override
    public Heroe clonarHeroe() {
        Guerrero clon = new Guerrero();
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
        System.out.println("Guerrero atacando pum pum");
    }

    @Override
    public void defender() {
        System.out.println("Guerrero defendiendo shing shing");

    }
}
