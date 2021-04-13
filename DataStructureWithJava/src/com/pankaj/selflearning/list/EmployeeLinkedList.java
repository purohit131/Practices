package com.pankaj.selflearning.list;

public class EmployeeLinkedList {

    private EmpNode head;
    private int size = 0;

    public void addToStart(Employee employee) {
        EmpNode empNode = new EmpNode(employee);
        empNode.setNext(head);
        head = empNode;
        size++;
    }

    public EmpNode removeFromStart() {
        EmpNode empNode = null;
        if (!isEmpty()) {
            empNode = head;
            head = head.getNext();
            empNode.setNext(null);
            size--;
        }
        return empNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmpNode currentNode = head;
        System.out.println("List : [");
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
            System.out.println(",");
        }
        System.out.println("]");
    }
}
