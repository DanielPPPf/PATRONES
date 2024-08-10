package ejercicio5;

public class FlowerDecorator extends HabitacionDecorator {

    public FlowerDecorator(Habitacion roomToDecorate) {
        super(roomToDecorate);
    }

    @Override
    public String decorar() {
        return super.decorar() + " con flores frescas";
    }
}
