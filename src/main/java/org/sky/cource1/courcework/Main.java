package org.sky.cource1.courcework;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println(employeeBook.findEmployeeWithMaximumWageByDepartmentName("5"));
        System.out.println(employeeBook.findEmployeeWithMinimumWageByDepartmentName("5"));
    }
}
