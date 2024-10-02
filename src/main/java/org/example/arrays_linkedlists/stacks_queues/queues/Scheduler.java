package org.example.arrays_linkedlists.stacks_queues.queues;


import java.util.LinkedList;
import java.util.Queue;


public class Scheduler {
    private Queue<String> tasks;

    public Scheduler() {
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task successfully added...");

    }

    public String removeCompletedTask() {
        if (tasks.isEmpty()) {
            System.out.println("No task in queue...");
            return null;
        }

        String task = tasks.poll();
        System.out.println("Completed task removed...");

        return task;
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found...");
        }

        System.out.println("Tasks in Queue...");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
