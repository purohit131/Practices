package com.pankaj.selflearning.queue;

import com.pankaj.selflearning.list.Employee;

public class ArrayQueueTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Pankaj", "BLR", 32);
        Employee emp2 = new Employee(113, "Mota Chua", "BLR", 29);
        Employee emp3 = new Employee(121, "Gol U", "BBSR", 25);
        Employee emp4 = new Employee(132, "Be B", "BBSR", 24);
        Employee emp5 = new Employee(156, "Cute", "BLR", 28);

        ArrayQueue queue = new ArrayQueue(5);
//        queue.add(emp1);
//        queue.add(emp2);
//        queue.remove();
//        queue.add(emp3);
//        queue.remove();
//        queue.add(emp4);
//        queue.remove();
//        queue.add(emp5);
//        queue.remove();
//        queue.add(emp1);
//        queue.printQueue();
//        System.out.println("--------------------------");

        queue.add(emp1);
        queue.add(emp2);
        queue.add(emp3);
        queue.add(emp4);
        queue.add(emp5);
        queue.printQueue();
        System.out.println("--------------------------");
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("--------------------------");

        //System.out.println(queue.peek());

        queue.remove();
        queue.remove();
        queue.remove();
       // queue.remove();
        queue.add(emp5);
        queue.printQueue();
        System.out.println("--------------------------");
    }

}
