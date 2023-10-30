package org.sky.cource1.courcework;

public class Employee {
    private String fullName;
    private String departmentName;
    private double employeeSalary;
    private static int idCounter = 0;
    private int id;

    public Employee(String fullName, String departmentName, int employeeSalary) {
        this.fullName = fullName;
        this.departmentName = departmentName;
        this.employeeSalary = employeeSalary;
        this.id = idCounter++;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee{" + "Имя Отчество Фамилия= " + fullName + " , id= " + id +
                ", Департамент= " + departmentName + ", Зарплата= " + employeeSalary + '}';
    }

    public String toStringWithoutDepart() {
        return "Employee{" + "Имя Отчество Фамилия= " + fullName + " , id= " + id
                + ", Зарплата= " + employeeSalary + '}';
    }
}
