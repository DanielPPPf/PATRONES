public class FachadaHeroe {
    public Heroe crearYPersonalizarHeroe(HeroeFactory factory, String nombre, Aspecto aspecto) {
        GestorHeroe gestor = new GestorHeroe(factory);
        return gestor.crearHeroe(nombre, aspecto);
    }
}