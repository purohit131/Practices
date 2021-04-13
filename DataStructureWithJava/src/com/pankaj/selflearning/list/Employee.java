package com.pankaj.selflearning.list;

public class Employee {

    private long id;
    private String name;
    private String city;
    private int age;

    public Employee(long id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public Employee() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Employee { id : " + this.id +
                ", name : " + this.name +
                ", city : " + this.city +
                ", age : " + this.age +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;

        return this.id == e.id &&
                this.name.equals(e.name) &&
                this.city.equals(e.city) &&
                this.age == e.age;
    }

    @Override
    public int hashCode() {
        int result = 31 * (int) id;
        result = 31 * result * name.hashCode();
        result = 31 * result * city.hashCode();
        result = 31 * result * age;
        return result;
    }
}
