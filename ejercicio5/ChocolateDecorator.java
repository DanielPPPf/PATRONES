package ejercicio5;

public class ChocolateDecorator extends HabitacionDecorator {

    public ChocolateDecorator(Habitacion roomToDecorate) {
        super(roomToDecorate);
    }

    @Override
    public String decorar() {
        return super.decorar() + " con chocolate gourmet";
    }
}
