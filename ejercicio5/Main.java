package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacionBasica = new HabitacionBasica();
        System.out.println(habitacionBasica.decorar());

        Habitacion habitacionConFlores = new FlowerDecorator(habitacionBasica);
        System.out.println(habitacionConFlores.decorar());

        Habitacion habitacionConChocolate = new ChocolateDecorator(habitacionConFlores);
        System.out.println(habitacionConChocolate.decorar());

        Habitacion habitacionConVino = new WineDecorator(habitacionConChocolate);
        System.out.println(habitacionConVino.decorar());
    }
}
