// Task.java
package com.company;
public interface Task {
    String getTaskName();
    void setTaskName(String name);
    boolean isTaskDone();
    void markTaskAsDone(boolean done);
}
