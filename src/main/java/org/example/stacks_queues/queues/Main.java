package org.example.stacks_queues.queues;

public class Main {
    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();
        scheduler.addTask("Task 1");
        scheduler.addTask("Task 2");
        scheduler.addTask("Task 3");
        scheduler.addTask("Task 4");
        scheduler.addTask("Task 5");
        scheduler.addTask("Task 6");
        scheduler.addTask("Task 7");
        scheduler.addTask("Task 8");


        scheduler.printTasks();

        scheduler.removeCompletedTask();

        scheduler.printTasks();
    }
}