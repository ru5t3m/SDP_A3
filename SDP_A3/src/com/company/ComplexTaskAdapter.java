package com.company;

public class ComplexTaskAdapter implements Task {
    private ComplexTask complexTask;

    public ComplexTaskAdapter(ComplexTask complexTask) {
        this.complexTask = complexTask;
    }

    @Override
    public String getTaskName() {
        return complexTask.getTaskDescription();
    }

    @Override
    public void setTaskName(String name) {
        complexTask = new ComplexTask(name);
    }

    @Override
    public boolean isTaskDone() {
        return complexTask.isTaskCompleted();
    }

    @Override
    public void markTaskAsDone(boolean done) {
        complexTask.completeTask(done);
    }
}

