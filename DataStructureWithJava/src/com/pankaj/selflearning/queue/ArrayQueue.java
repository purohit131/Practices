package com.pankaj.selflearning.queue;

import com.pankaj.selflearning.list.Employee;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newQueue = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, rear);
            queue = newQueue;
            front = 0;
            rear = numItems;
        }
        queue[rear] = employee;
        if (rear < queue.length - 1) {
            rear++;
        } else {
            rear = 0;
        }
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            rear = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new EmptyStackException();
        }
        return queue[front];
    }

    private int size() {
        if (front <= rear) {
            return rear - front;
        } else {
            return rear - front + queue.length;
        }
    }

    public void printQueue() {
        if (front <= rear) {
            for (int i = front; i < rear; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
