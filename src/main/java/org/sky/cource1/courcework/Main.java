package org.sky.cource1.courcework;

public class Main {

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
    }

}
