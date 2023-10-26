package org.sky.cource1.courcework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {

    Employee[] employeesArr = Employee.employeesArr;

//++++++++++++++++++++++++++++++++++++++++++++++++
//    **Очень сложно**
//++++++++++++++++++++++++++++++++++++++++++++++++
//4. Добавить несколько новых методов:
//    1. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
//    Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала,
//    так как возможно добавление в ячейку удаленных ранее сотрудников.
    //public void addNewEmployee(Employee[] employeesArr, Employee newEmployee, int id) {

    public void addNewEmployee(Employee newEmployee, int id) {
        Employee[] newEmplArr = deleteEmployee(employeesArr, id);
        for (int i = 0; i < newEmplArr.length; i++) {
            if (newEmplArr[i] == null) {
                newEmplArr[i] = newEmployee;
                break;
            }
        }
    }

    // 2. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
    private Employee[] deleteEmployee(Employee[] employeesArr, int id) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] != null && employeesArr[i].getId() == id) {
                employeesArr[i] = null;
            }
        }
        return employeesArr;
    }

    // 5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
// 1. Изменить зарплату. //2. Изменить отдел.
// Придумать архитектуру. Сделать или два метода, или один, но продумать его.
    public Employee[] changeEmployeeProperty(String nameEmployee, double salary, String department) {
        for (Employee employee : employeesArr) {
            if (employee.getFullName().equals(nameEmployee) && employee != null) {
                if (salary > employee.getSalary()) {
                    changeEmployeeSalary(employee, salary);
                }
                if (department != employee.getDepartmentName()) {
                    changeEmployeeDepartment(employee, department);
                }
            }
        }
        return employeesArr;
    }

    private void changeEmployeeDepartment(Employee employee, String department) {
        employee.setDepartmentName(department);
    }

    private void changeEmployeeSalary(Employee employee, double salary) {
        employee.setEmployeeSalary(salary);
    }

    //6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public List<String> getFullNameAllEmployeesByDepartment(String departmentName) {
        List<String> employeeList = new ArrayList<>();
        for (Employee employee : employeesArr) {
            if (employee != null) {
                if (employee.getDepartmentName() == departmentName) {
                    employeeList.add(employee.getFullName() + " " + employee.getDepartmentName());
                }
            }
        }
        return employeeList;
    }
//++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++++
//    ** Повышенная сложность **
//++++++++++++++++++++++++++++++++++++++++++++++++
//    Создать дополнительные статические методы для решения следующих задач.
//    1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public Double indexSalaryByPercentage(Employee[] employeesArr, double indexUpPercentage) {
        double indexedSalary = 0;
        for (Employee employee : employeesArr) {
            if (employee != null) {
                indexedSalary = employee.getSalary() + ((employee.getSalary() * indexUpPercentage) / 100);
                employee.setEmployeeSalary(indexedSalary);
            }
        }
        return indexedSalary;
    }

    // 2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
// 1. Сотрудника с минимальной зарплатой.
    public Employee findEmployeeWithMinimumWageByDepartmentName(String departmentName) {
        Employee employee = null;
        double minSalary = Integer.MAX_VALUE;
        List<Employee> employeesArrWithFilter = getFilteredEmployees(employeesArr, departmentName);
        for (Employee emp : employeesArrWithFilter) {
            double salary = emp.getSalary();
            if (salary < minSalary && emp != null) {
                minSalary = salary;
                if (minSalary == salary) {
                    employee = emp;
                }
            }
        }
        return employee;
    }

    private List<Employee> getFilteredEmployees(Employee[] employeesArr, String departmentName) {
        List<Employee> employeesArrWithFilter = new ArrayList<>();
        for (Employee emp : employeesArr) {
            if (emp.getDepartmentName().equals(departmentName)) {
                if (emp != null) {
                    employeesArrWithFilter.add(emp);
                }
            }
        }
        return employeesArrWithFilter;
    }

    // 2. Сотрудника с максимальной зарплатой.
    public Employee findEmployeeWithMaximumWageByDepartmentName(String departmentName) {
        Employee[] employeesArrWithFilter = new Employee[employeesArr.length];
        Employee employee = null;
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getDepartmentName().equals(departmentName)) {
                employeesArrWithFilter[i] = employeesArr[i];
            }
        }
        for (Employee emp : employeesArrWithFilter) {
            double salary = emp.getSalary();
            if (salary > maxSalary && emp != null) {
                maxSalary = salary;
                if (maxSalary == salary) {
                    employee = emp;
                }
            }
        }
        return employee;
    }

    // 3. Сумму затрат на зарплату по отделу.
    public double calcAmountSalaryByDepartmentName(String departmentName) {
        double salaryCostsByDepart = 0;
        List<Employee> employeesArrWithFilter = getFilteredEmployees(employeesArr, departmentName);
        for (Employee employee : employeesArrWithFilter) {
            if (employee != null) {
                salaryCostsByDepart += employee.getSalary();
            }
        }
        return salaryCostsByDepart;
    }

    // 4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    public Double calcAverageValueSalariesByDepartmentName(String departmentName) {
        List<Employee> employeesArrWithFilter = getFilteredEmployees(employeesArr, departmentName);
        return calcAverageValueSalaries(employeesArrWithFilter.toArray(new Employee[employeesArrWithFilter.size()]));
    }

    // 5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public Double indexSalaryByPercentageByDepartmentName(Employee[] employeesArr, double indexUpPercentage, String departmentName) {
        List<Employee> employeesArrWithFilter = getFilteredEmployees(employeesArr, departmentName);
        return indexSalaryByPercentage(employeesArrWithFilter.toArray(new Employee[employeesArrWithFilter.size()]), indexUpPercentage);
    }

    // 6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public void getEmployeesDataListWithoutDepartment() {
        for (Employee employee : employeesArr) {
            if (employee != null) {
                System.out.println(employee.toStringWithoutDepart());
            }
        }
    }

    //  3. Получить в качестве параметра число и найти:
//  a. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void allEmployeesWithSalaryLessThanNumber(double num) {
        List<Employee> employeesArrWithFilter = new ArrayList<>();
        for (Employee employee : employeesArr) {
            if (employee.getSalary() < num && employee != null) {
                employeesArrWithFilter.add(employee);
                System.out.println(employee);
            }
        }
    }

    //  b. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void allEmployeesWithSalaryGreaterThanNumber(double num) {
        Employee[] employeesArrWithFilter = new Employee[employeesArr.length];
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getSalary() >= num && employeesArrWithFilter[i] != null) {
                employeesArrWithFilter[i] = employeesArr[i];
                if (employeesArrWithFilter[i] != null) {
                    System.out.println(employeesArrWithFilter[i]);
                }
            }
        }
    }
//++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++++
//    ** Базовая сложность **
//++++++++++++++++++++++++++++++++++++++++++++++++
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными
    // (вывести в консоль значения всех полей (toString)).
    public void getEmployeesDataList(Employee[] employeesArr) {
        for (Employee employee : employeesArr) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    //2. Посчитать сумму затрат на зарплаты в месяц.
    public double calcAmountSalaryCostsPerMonth(Employee[] employeesArr) {
        double salaryCostsPerMonth = 0;
        for (Employee employee : employeesArr) {
            if (employee != null) {
                salaryCostsPerMonth += employee.getSalary();
            }
        }
        return salaryCostsPerMonth;
    }

    //3. Найти сотрудника с минимальной зарплатой.
    public Employee findEmployeeWithMinimumWage() {
        Employee employee = employeesArr[0];
        double minSalary = employeesArr[0].getSalary();
        for (Employee e : employeesArr) {
            if (e != null && e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                employee = e;
            }
        }
        return employee;
    }

    //4. Найти сотрудника с максимальной зарплатой.
    public Employee findEmployeeWithMaximumWage(Employee[] employeesArr) {
        Employee employee = employeesArr[0];
        double maxSalary = employeesArr[0].getSalary();
        for (Employee e : employeesArr) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                if (maxSalary == e.getSalary()) {
                    employee = e;
                }
            }
        }
        return employee;
    }

    //5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public Double calcAverageValueSalaries(Employee[] employeesArr) {
        double countEmployees = employeesArr.length;
        double summ = calcAmountSalaryCostsPerMonth(employeesArr);
        return summ / countEmployees;
    }

    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public void getEmployeesName(Employee[] employeesArr) {
        for (Employee employee : employeesArr) {
            System.out.println(employee.getFullName());
        }
    }
}
