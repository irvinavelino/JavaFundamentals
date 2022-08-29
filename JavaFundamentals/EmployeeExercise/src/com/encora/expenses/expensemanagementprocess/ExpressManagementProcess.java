package com.encora.expenses.expensemanagementprocess;

import com.encora.expenses.domain.Employee;
import com.encora.expenses.domain.ExpenseClaim;

public interface ExpressManagementProcess
{
    public int registerExpenseClaim(ExpenseClaim claim);
    public boolean approveClaim(int id, Employee employee);
}
