package com.pankaj.selflearning.list;

public class Test {
    public static void main(String[] args) {
//        EmployeeLinkedList list = new EmployeeLinkedList();
//        list.addToStart(new Employee(101,"Pankaj","BLR",32));
//        list.addToStart(new Employee(113,"Mota Chua","BLR",29));
//        list.addToStart(new Employee(121,"Gol U","BBSR",25));
//        list.addToStart(new Employee(132,"Be B","BBSR",24));
//
//        list.printList();
//
//        list.removeFromStart();
//
//        list.printList();

        EmployeeDoublyList list = new EmployeeDoublyList();
        Employee emp1 = new Employee(101, "Pankaj", "BLR", 32);
        Employee emp2 = new Employee(113, "Mota Chua", "BLR", 29);
        Employee emp3 = new Employee(121, "Gol U", "BBSR", 25);
        Employee emp4 = new Employee(132, "Be B", "BBSR", 24);
        Employee emp5 = new Employee(156, "Cute", "BLR", 28);
        list.addToStart(emp1);
        list.addToStart(emp2);
        list.addToStart(emp3);
        list.addToStart(emp4);

        list.printList();

        list.addBefore(emp2, emp5);

        list.printList();

//        list.addToEnd(new Employee(112, "Musa", "Pune", 2));
//
//        list.printList();
//
//        list.removeFromStart();
//        list.printList();
//        list.removeFromEnd();
//        list.printList();
//        list.removeFromEnd();
//        list.removeFromEnd();
//        list.removeFromEnd();
//        list.printList();

    }
}
