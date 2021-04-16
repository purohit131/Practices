package com.pankaj.selflearning.stack;

import com.pankaj.selflearning.list.Employee;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Employee> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public void printStack() {
        for (Employee emp : stack) {
            System.out.println(emp);
        }
    }
}
