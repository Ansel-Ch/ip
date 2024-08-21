public class Task {
    private String description;
    private boolean done;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public void setDone() {
        done = true;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return description;
    }
}
