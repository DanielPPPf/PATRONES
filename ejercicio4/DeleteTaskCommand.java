package ejercicio4;

public class DeleteTaskCommand implements Command {
    private Task task;

    public DeleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.delete();
    }

    @Override
    public void undo() {
        System.out.println("Recreando la tarea: " + task.getName());
    }
}
