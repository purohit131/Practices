package com.pankaj.selflearning.list;

public class EmpNode {

    private Employee employee;
    private EmpNode next;

    public EmpNode(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee emp) {
        this.employee = emp;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setNext(EmpNode next) {
        this.next = next;
    }

    public EmpNode getNext() {
        return this.next;
    }

    public String toString() {
        return employee.toString();
    }
}
