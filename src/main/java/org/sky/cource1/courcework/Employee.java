package org.sky.cource1.courcework;

public class Employee {
    String firstName, middleName, lastName;
    String fullName;
    String departmentName;
    double employeeSalary;
    static int idCounter = 0;
    int id;

    public Employee(String firstName, String middleName, String lastName, String departmentName, int employeeSalary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.employeeSalary = employeeSalary;
        this.id = idCounter++;
        this.fullName = getFullName(firstName, middleName, lastName);
    }

    private String getFullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public static int getCountId() {
        return idCounter;
    }

    public static void setCountId(int countId) {
        Employee.idCounter = countId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee{" + "Имя= " + firstName + ", Отчество= " + middleName + ", Фамилия= " + lastName +
                " , id= " + id + ", Департамент= " + departmentName + ", Зарплата= " + employeeSalary + '}';
    }

    public String toStringWithoutDepart(String str) {
        return "Employee{" + "Имя= " + firstName + ", Отчество= " + middleName + ", Фамилия= " + lastName +
                " , id= " + id + ", Зарплата= " + employeeSalary + '}';
    }

    public String getFullName() {
        return fullName;
    }

    public String toStringFIO() {
        return firstName + " " + middleName + " " + lastName;
    }
}
