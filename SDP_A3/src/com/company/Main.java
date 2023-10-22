package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task simpleTask = createSimpleTask(scanner);
        Task complexTaskAdapter = createComplexTask(scanner);

        displayTaskDetails(simpleTask);
        displayTaskDetails(complexTaskAdapter);

        scanner.close();
    }

    public static Task createSimpleTask(Scanner scanner) {
        System.out.print("Enter a name for your simple task: ");
        String taskName = scanner.nextLine();

        System.out.print("Is the simple task done? (true/false): ");
        boolean isTaskDone = scanner.nextBoolean();
        scanner.nextLine();
        Task simpleTask = new SimpleTask(taskName);
        simpleTask.markTaskAsDone(isTaskDone);

        return simpleTask;
    }

    public static Task createComplexTask(Scanner scanner) {
        System.out.print("Enter a description for your complex task: ");
        String taskDescription = scanner.nextLine();

        System.out.print("Is the complex task completed? (true/false): ");
        boolean isTaskCompleted = scanner.nextBoolean();
        scanner.nextLine();
        ComplexTask complexTask = new ComplexTask(taskDescription);
        complexTask.completeTask(isTaskCompleted);

        return new ComplexTaskAdapter(complexTask);
    }

    public static void displayTaskDetails(Task task) {
        System.out.println("Task Name: " + task.getTaskName());
        System.out.println("Task Status: " + (task.isTaskDone() ? "Done" : "Not Done"));
    }
}
