package joe.commands;

/**
 * Represents a command to exit the program.
 */
public class ByeCommand extends Command {

    /**
     * Prints a goodbye message.
     */
    @Override
    public void execute() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
