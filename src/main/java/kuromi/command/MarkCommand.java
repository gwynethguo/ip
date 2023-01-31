package kuromi.command;

import kuromi.Storage;
import kuromi.Ui;
import kuromi.task.Task;
import kuromi.task.TaskList;

/**
 * Mark task as done.
 */
public class MarkCommand extends Command {
    /** Index of the task to be marked **/
    private int idx;

    /**
     * Main constructor.
     *
     * @param idx Index of the task to be marked.
     */
    public MarkCommand(int idx) {
        this.idx = idx;
    }

    /**
     * Mark the task as done in the task list.
     * Ask UI to print output.
     *
     * @param tasks Task list.
     * @param ui UI of the application to interact with users.
     * @param storage Storage to update when there is an update with the task list.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task cur = tasks.mark(this.idx - 1);
        String msg = "Nice! I've marked this task as done:\n";
        msg += cur;
        ui.show(msg);
    }
}
