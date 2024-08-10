package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Tarea 1");

        TaskManager manager = new TaskManager();

        Command createCommand = new CreateTaskCommand(task);
        Command editCommand = new EditTaskCommand(task, "Tarea 1 Editada");
        Command completeCommand = new CompleteTaskCommand(task);
        Command deleteCommand = new DeleteTaskCommand(task);

        manager.executeCommand(createCommand);
        manager.executeCommand(editCommand);
        manager.executeCommand(completeCommand);
        manager.executeCommand(deleteCommand);

        manager.undoLastCommand();
    }
}
