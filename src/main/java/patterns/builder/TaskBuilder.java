package patterns.builder;

import java.util.Date;

public class TaskBuilder {

    private long id;
    private String summary;
    private String description;
    private boolean isDone;
    private Date deadline;

    public TaskBuilder() {
    }

    public TaskBuilder setId(long id) {
        this.id = id;
        return this;
    }
    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }
    public TaskBuilder setIsDone(boolean isDone) {
        this.isDone = isDone;
        return this;
    }
    public TaskBuilder setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public Task  build() {
        return new Task(id,summary,description,isDone,deadline);
    }
}
