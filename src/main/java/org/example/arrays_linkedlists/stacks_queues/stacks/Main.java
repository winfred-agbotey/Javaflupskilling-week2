package org.example.arrays_linkedlists.stacks_queues.stacks;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            calculator.push(10);
            calculator.push(5);
            calculator.performOperation('+');
            System.out.println("Result: " + calculator.calculate()); // Output: Result: 15.0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
