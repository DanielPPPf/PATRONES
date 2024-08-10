package ejercicio5;

public abstract class HabitacionDecorator implements Habitacion {
    protected Habitacion roomToDecorate;

    public HabitacionDecorator(Habitacion roomToDecorate) {
        this.roomToDecorate = roomToDecorate;
    }

    @Override
    public String decorar() {
        return roomToDecorate.decorar();
    }
}
