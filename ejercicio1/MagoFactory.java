public class MagoFactory implements HeroeFactory {
    @Override
    public Heroe crearHeroe(String nombre, Aspecto aspecto) {
        Mago mago = new Mago();
        mago.nombre = nombre;
        mago.cambiarAspecto(aspecto);
        return mago;
    }
}