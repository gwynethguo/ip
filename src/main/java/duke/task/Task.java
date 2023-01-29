package duke.task;

/**
 * Parent class of Todo, Deadline, and Event.
 * Contains attributes and methods that a task should have.
 */
public class Task {
    /** The description of a task **/
    protected String description;
    /** The status of a task **/
    protected boolean isDone;

    /**
     * Main constructor (for invocation by most classes)
     *
     * @param description Description of the task
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Secondary constructor (for invocation by Storage to put task in data into TaskList)
     *
     * @param description Description of a task.
     * @param isDone Status of a task.
     */
    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Get the detailed description of a Task.
     * To store the current data into the file.
     *
     * @return Detailed description as a String.
     */
    public String getDetailedDescription() {
        return this.description;
    }

    /**
     * Get a boolean value of whether the current task's description contains the keyword.
     *
     * @param keyword Keyword to be searched.
     * @return Boolean value of whether the description contains the keyword.
     */
    public boolean containsKeyword(String keyword) {
        return this.description.contains(keyword);
    }

    /**
     * Get the status of a task.
     *
     * @return Status of a task.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Get the symbol of a task.
     *
     * @return Symbol of a task.
     */
    public String getSymbol() {
        return "";
    }

    /**
     * Mark task as done.
     */
    public void mark() {
        this.isDone = true;
    }

    /**
     * Mark task as not done.
     */
    public void unmark() {

        this.isDone = false;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }

}
