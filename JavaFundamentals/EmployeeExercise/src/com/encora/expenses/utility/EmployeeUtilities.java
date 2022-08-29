package com.encora.expenses.utility;

import com.encora.expenses.Exceptions.InvalidEmployeeIdException;
import com.encora.expenses.Exceptions.NameToShortException;
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
    public Integer validateEmployeeId(String inputId) throws InvalidEmployeeIdException
    {
        try
        {
            Integer id = Integer.valueOf(inputId);
            return id;
        }
        catch(NumberFormatException e)
        {
            throw new InvalidEmployeeIdException();
        }
    }
    public void ValidateEmployeeName(String firstName,String surname) throws NameToShortException {
        Integer length=firstName.length()+surname.length();
        if(length<6)
        {
            throw  new NameToShortException();
        }
    }
}
