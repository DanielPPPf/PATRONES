package ejercicio4;

public class CreateTaskCommand implements Command {
    private Task task;

    public CreateTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.create();
    }

    @Override
    public void undo() {
        task.delete();
    }
}
