package com.company;

public class SimpleTask implements Task {
    private String taskName;
    private boolean done;

    public SimpleTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskName(String name) {
        this.taskName = name;
    }

    @Override
    public boolean isTaskDone() {
        return done;
    }

    @Override
    public void markTaskAsDone(boolean done) {
        this.done = done;
    }
}
