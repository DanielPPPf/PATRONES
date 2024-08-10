package ejercicio4;

public class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void create() {
        System.out.println("Creando la tarea: " + name);
    }

    public void edit(String newName) {
        System.out.println("Editando la tarea: " + name + " a " + newName);
        this.name = newName;
    }

    public void complete() {
        System.out.println("Completando la tarea: " + name);
    }

    public void delete() {
        System.out.println("Eliminando la tarea: " + name);
    }
}
