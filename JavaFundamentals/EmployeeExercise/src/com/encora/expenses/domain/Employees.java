package com.encora.expenses.domain;

import com.encora.expenses.Exceptions.EmployeeNotFound;
import com.encora.expenses.domain.Employee;

import java.util.*;

public class Employees {
    private Map<Integer,Employee> employees=new HashMap<>();

    public void addEmployee(Employee employee)
    {
        employees.put(employee.getId(),employee);
    }

    public void printEmployees() {
        List<Employee> employeeList=new ArrayList<>(employees.values());
        Collections.sort(employeeList);
        for (Employee e : employeeList)
        {
                System.out.println(e);
        }
    }

    public Employee getBySurname(String surname) {
        for (Employee e : employees.values()) {
            if (e.getSurname().equals(surname)) {
                return e;
            }
        }
        return null;
    }
    public Employee getById(Integer id) {
        return employees.get(id);
    }

    public boolean employeeExists(int id)
    {
        return  employees.containsKey(id);
    }
    public void addExpenseClaim(ExpenseClaim claim) throws EmployeeNotFound
    {
        Integer employeeId=claim.getEmployeeId();
        if(!employeeExists(employeeId))
        {
            throw new EmployeeNotFound();
        }
        for (Employee e : employees.values()) {
            if (e.getId()==employeeId)
            {
                e.getClaims().put(claim.getId(),claim);
            }
        }
    }
}
