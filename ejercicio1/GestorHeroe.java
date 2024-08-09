public class GestorHeroe {
    private HeroeFactory factory;

    public GestorHeroe(HeroeFactory factory) {
        this.factory = factory;
    }

    public Heroe crearHeroe(String nombre, Aspecto aspecto) {
        return factory.crearHeroe(nombre, aspecto);
    }
}