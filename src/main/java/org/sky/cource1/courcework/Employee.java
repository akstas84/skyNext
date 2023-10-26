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

    static Employee[] employeesArr;

    public static void main(String[] args) {
        employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Vasya Vasin Vas", "1", 100);
        employeesArr[1] = new Employee("Kolya Kolin Kol", "2", 110);
        employeesArr[2] = new Employee("Vera Verina Ver", "3", 120);
        employeesArr[3] = new Employee("Olesya Olesina Ol", "4", 130);
        employeesArr[4] = new Employee("Petya Petin Pet", "5", 140);
        employeesArr[5] = new Employee("Stas St St", "5", 130);
        employeesArr[6] = new Employee("Diana Di Di", "4", 120);
        employeesArr[7] = new Employee("Olya Ol Ol", "3", 110);
        employeesArr[8] = new Employee("Valera Davaiy Delaay Veschi", "2", 100);
        employeesArr[9] = new Employee("Grisha Gr Gr", "1", 90);

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.getFullNameAllEmployeesByDepartment("3");

        employeeBook.addNewEmployee(new Employee("qwe", "qwe", 120), 0);
        System.out.println();
        System.out.println(employeeBook.findEmployeeWithMinimumWage());

        System.out.println();

        employeeBook.allEmployeesWithSalaryGreaterThanNumber(120);
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
