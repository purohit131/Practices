package com.pankaj.selflearning.stack;

import com.pankaj.selflearning.list.Employee;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        Employee emp1 = new Employee(101, "Pankaj", "BLR", 32);
        Employee emp2 = new Employee(113, "Mota Chua", "BLR", 29);
        Employee emp3 = new Employee(121, "Gol U", "BBSR", 25);
        Employee emp4 = new Employee(132, "Be B", "BBSR", 24);
        Employee emp5 = new Employee(156, "Cute", "BLR", 28);
        linkedListStack.push(emp1);
        linkedListStack.push(emp2);
        linkedListStack.push(emp3);
        linkedListStack.push(emp4);
        linkedListStack.push(emp5);
        linkedListStack.printStack();
        System.out.println("--------------------------");
        Employee emp = linkedListStack.peek();
        System.out.println("After peek " + emp);
        linkedListStack.printStack();
        System.out.println("******************************");
        linkedListStack.pop();
        linkedListStack.printStack();
    }
}
