public class Deadline extends Task {
    private String due;

    public Deadline(String... params) throws IllegalArgumentException {
        super(params[0].strip());
        if (params.length < 2) {
            throw new IllegalArgumentException("Deadline: You did not provide a due date/time.");
        }

        StringBuilder str = new StringBuilder(params[1].strip());
        str.insert(str.indexOf(" "), ':');
        this.due = str.toString();
    }

    @Override
    public String toString() {
        return String.format("[D]%s (%s)", super.toString(), due);
    }
}
