package com.pankaj.selflearning.stack;

import com.pankaj.selflearning.list.Employee;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        Employee emp1 = new Employee(101, "Pankaj", "BLR", 32);
        Employee emp2 = new Employee(113, "Mota Chua", "BLR", 29);
        Employee emp3 = new Employee(121, "Gol U", "BBSR", 25);
        Employee emp4 = new Employee(132, "Be B", "BBSR", 24);
        Employee emp5 = new Employee(156, "Cute", "BLR", 28);
        arrayStack.push(emp1);
        arrayStack.push(emp2);
        arrayStack.push(emp3);
        arrayStack.push(emp4);
        arrayStack.push(emp5);
        arrayStack.printStack();
        System.out.println("--------------------------");
        Employee emp = arrayStack.peek();
        System.out.println("After peek " + emp);
        arrayStack.printStack();
        System.out.println("******************************");
        arrayStack.pop();
        arrayStack.printStack();
    }
}
