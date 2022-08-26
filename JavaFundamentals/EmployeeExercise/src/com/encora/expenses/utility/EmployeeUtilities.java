package com.encora.expenses.utility;

import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.Employees;

public class EmployeeUtilities
{
    public boolean employeeExists(Employees employees, Employee employee)
    {
        if(employees.getBySurname(employee.getSurname())!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
