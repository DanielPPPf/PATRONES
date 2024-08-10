package ejercicio5;

public class WineDecorator extends HabitacionDecorator {

    public WineDecorator(Habitacion roomToDecorate) {
        super(roomToDecorate);
    }

    @Override
    public String decorar() {
        return super.decorar() + " con vinito pa disfrutar";
    }
}
