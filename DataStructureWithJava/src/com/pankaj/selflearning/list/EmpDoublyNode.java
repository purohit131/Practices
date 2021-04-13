package com.pankaj.selflearning.list;

public class EmpDoublyNode {

    private Employee employee;
    private EmpDoublyNode next;
    private EmpDoublyNode previous;

    public EmpDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee emp) {
        this.employee = emp;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setNext(EmpDoublyNode next) {
        this.next = next;
    }

    public EmpDoublyNode getNext() {
        return this.next;
    }

    public EmpDoublyNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(EmpDoublyNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return employee.toString();
    }
}
