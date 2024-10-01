package org.example.arrays_linkedlists.stacks_queues.stacks;

import java.util.Stack;

public class Calculator {
    private Stack<Double> stack;

    public Calculator() {
        stack = new Stack<>();
    }

    public void push(double value) {
        stack.push(value);
    }

    public double pop() throws StackException {
        if (stack.isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return stack.pop();
    }

    public void performOperation(char operator) throws StackException {
        if (stack.size() < 2) {
            throw new StackException("Not enough operands");
        }

        double b = pop();
        double a = pop();

        switch (operator) {
            case '+' -> push(a + b);
            case '-' -> push(a - b);
            case '*' -> push(a * b);
            case '/' -> {
                if (b == 0) {
                    throw new StackException("Division by zero");
                }
                push(a / b);
            }
            default -> throw new StackException("Unknown operator: " + operator);
        }
    }

    public double calculate() throws StackException {
        return pop();
    }
}
