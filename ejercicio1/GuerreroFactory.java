public class GuerreroFactory implements HeroeFactory {
    @Override
    public Heroe crearHeroe(String nombre, Aspecto aspecto) {
        Guerrero guerrero = new Guerrero();
        guerrero.nombre = nombre;
        guerrero.cambiarAspecto(aspecto);
        return guerrero;
    }
}