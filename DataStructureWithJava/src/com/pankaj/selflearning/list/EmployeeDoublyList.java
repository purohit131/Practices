package com.pankaj.selflearning.list;

public class EmployeeDoublyList {

    private EmpDoublyNode head;
    private EmpDoublyNode tail;
    int size = 0;

    public void addToStart(Employee employee) {
        EmpDoublyNode empNode = new EmpDoublyNode(employee);
        if (head == null) {
            tail = empNode;
        } else {
            head.setPrevious(empNode);
            empNode.setNext(head);
        }
        head = empNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmpDoublyNode empNode = new EmpDoublyNode(employee);
        if (tail == null) {
            head = empNode;
        } else {
            empNode.setPrevious(tail);
            tail.setNext(empNode);
        }
        tail = empNode;
        size++;
    }

    public EmpDoublyNode removeFromStart() {
        EmpDoublyNode empNode = null;
        if (head != null) {
            empNode = head;
            if (head.getNext() == null) {
                tail = null;
            } else {
                head.getNext().setPrevious(null);
            }
            head = head.getNext();
            empNode.setNext(null);
            size--;
        }
        return empNode;
    }

    public EmpDoublyNode removeFromEnd() {
        EmpDoublyNode empNode = null;
        if (tail != null) {
            empNode = tail;
            if (tail.getPrevious() == null) {
                head = null;
            } else {
                tail.getPrevious().setNext(null);
            }
            tail = tail.getPrevious();
            empNode.setPrevious(null);
            size--;
        }
        return empNode;
    }

    public boolean addBefore(Employee existingEmp, Employee newEmp) {

        if (head == null) return false;
        EmpDoublyNode existingNode = head;
        while (existingNode != null && !existingEmp.equals(existingNode.getEmployee())) {
            existingNode = existingNode.getNext();
        }

        if (existingNode == null) return false;

        EmpDoublyNode newNode = new EmpDoublyNode(newEmp);

        newNode.setPrevious(existingNode.getPrevious());
        newNode.setNext(existingNode);
        existingNode.setPrevious(newNode);

        if (head == existingNode) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmpDoublyNode currentNode = head;
        System.out.println("List : [");
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
            System.out.println(",");
        }
        System.out.println("]");
    }
}
