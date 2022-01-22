package patterns.builder;

import java.util.Date;

public class Task {

    private long id;
    private String summary;
    private String description;
    private boolean isDone;
    private Date deadline;

    public Task(long id, String summary, String description, boolean isDone, Date deadline) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.isDone = isDone;
        this.deadline = deadline;
    }

    public Task() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
