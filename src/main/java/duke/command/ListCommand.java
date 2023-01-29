package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

/**
 * Command to list the tasks in the task list.
 */
public class ListCommand extends Command {
    /**
     * Ask UI to list the tasks.
     *
     * @param tasks Task list.
     * @param ui UI of the application to interact with users.
     * @param storage Storage to update when there is an update with the task list.
     */
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        String msg = "Got it. I've added this task:\n";
        msg += tasks.toString() + "\n";
        msg += "Now you have " + tasks.size() + " tasks in the list.";
        ui.show(msg);
    }
}
