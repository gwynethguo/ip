package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.Task;
import duke.task.TaskList;

/**
 * Mark task as not done.
 */
public class UnmarkCommand extends Command {
    /** Index of the task to be unmarked. **/
    private int idx;

    /**
     * Main constructor.
     *
     * @param idx Index of the task to be unmarked.
     */
    public UnmarkCommand(int idx) {
        this.idx = idx;
    }

    /**
     * Mark the task as not done.
     * Ask UI to print the ouput.
     *
     * @param tasks Task list.
     * @param ui UI of the application to interact with users.
     * @param storage Storage to update when there is an update with the task list.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task cur = tasks.unmark(this.idx - 1);
        String msg = "OK, I've marked this task as not done yet:\n";
        msg += cur;
        ui.show(msg);
    }
}
