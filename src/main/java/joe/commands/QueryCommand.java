package joe.commands;

import joe.tasks.TaskList;

/**
 * Represents a command to query tasks by date from the task list.
 */
public class QueryCommand extends Command {
    private final TaskList tasks;

    private final String date;

    /**
     * Constructs a QueryCommand object.
     * @param tasks Task list to query tasks from.
     * @param date Date to query tasks by.
     */
    public QueryCommand(TaskList tasks, String date) {
        this.tasks = tasks;
        this.date = date;
    }

    @Override
    public void execute() {
        tasks.queryTasksByDate(date);
    }
}
