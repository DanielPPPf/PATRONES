package ejercicio4;

public class EditTaskCommand implements Command {
    private Task task;
    private String newName;
    private String oldName;

    public EditTaskCommand(Task task, String newName) {
        this.task = task;
        this.newName = newName;
        this.oldName = task.getName();
    }

    @Override
    public void execute() {
        task.edit(newName);
    }

    @Override
    public void undo() {
        task.edit(oldName);
    }
}
