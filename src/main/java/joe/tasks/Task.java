package joe.tasks;

/**
 * Represents a task in the task list.
 */
public abstract class Task {
    private final String description;
    private boolean isDone;

    /**
     * Constructor for Task.
     *
     * @param description a String describing the Task
     * @throws IllegalArgumentException if description.isEmpty()
     */
    public Task(String description) throws IllegalArgumentException {
        if (description.isEmpty()) {
            throw new IllegalArgumentException("You can't do a non-existent task.");
        }

        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns the description of the task.
     *
     * @return a String representing the description of the task
     */
    public String saveRepr() {
        return String.format("%d | %s", isDone ? 1 : 0, description);
    }


    /**
     * Sets the status of the task.
     *
     * @param done a boolean that determines whether a task is done
     */
    public void setDone(boolean done) {
        this.isDone = done;
    }


    /**
     * Returns a formatted String that represents the done and description fields of the Task
     *
     * @return a String representation of the Task object
     */
    @Override
    public String toString() {
        char mark = isDone ? 'X' : ' ';
        return String.format("[%c] %s", mark, description);
    }

    /**
     * Returns the description of the task.
     *
     * @return a String representing the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the status of the task.
     *
     * @return a boolean representing the status of the task
     */
    public boolean checkDone() {
        return isDone;
    }
}
