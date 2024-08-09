public class ArqueroFactory implements HeroeFactory {
    @Override
    public Heroe crearHeroe(String nombre, Aspecto aspecto) {
        Arquero arquero = new Arquero();
        arquero.nombre = nombre;
        arquero.cambiarAspecto(aspecto);
        return arquero;
    }
}