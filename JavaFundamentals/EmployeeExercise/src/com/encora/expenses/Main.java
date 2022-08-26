package com.encora.expenses;

import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.Employees;
import com.encora.expenses.domain.ExpenseClaim;
import com.encora.expenses.domain.ExpenseItem;

public class Main {
    public static void main(String[] args)
    {
        Employee employee1= new Employee();
        employee1.setId(1);
        employee1.setTitle("Mr");
        employee1.setFirstName("Matt");
        employee1.setSurname("Purple");

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));

        Employee employee2= new Employee(2,"Manager");
        employee2.setTitle("Dr");
        employee2.setFirstName("Denis");
        employee2.setSurname("Yellow");

        Employees employees= new Employees(15);
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(new Employee(3,"Mrs","Susan","Brown","director","test"));
        employees.printEmployees();
        Employee foundEmployee=employees.getBySurname("Brown");
        System.out.println("Found "+foundEmployee.getMailingName());

        ExpenseClaim expenseClaim= new ExpenseClaim(24,642,"2022-09-01",26.99);
        System.out.println(expenseClaim.getEmployeeId());
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());
        expenseClaim.setApproved(true);
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());

        ExpenseItem expenseItem= new ExpenseItem(23,102,"hotel","the grand hotel",69.00);
        System.out.println(expenseItem.getDescription());
    }
}